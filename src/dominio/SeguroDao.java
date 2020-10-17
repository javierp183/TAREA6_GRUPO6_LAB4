package dominio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class SeguroDao {
	//recordar cambiar usuario-password dependiendo del acceso a la base de desarrollo
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "password";
	private String dbName = "SegurosGroup";
	
	
	public SeguroDao () {
		
	}
	
	
	
	//public int agregarSeguro(int id, String descripcion, String tiposeguro, int costocontratacion, int costomax ) {
	public int agregarSeguro(Seguro seguro) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String query = "Insert into usuario(idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) values "
				+ "('"+seguro.getId()+"','"+seguro.getDescripcion()+"','"+seguro.getTipoSeguro()+"','"+seguro.getCostoContratacion()+"','"+seguro.getCostoMaximoAsegurado()+"')";

//		String query = "INSERT INTO seguros(idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) VALUES "
//				+ "('"+ id + "','" + descripcion + "','" + tiposeguro  + "','" + costocontratacion  + "','" +costomax + "')";
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}
	
	public int listarSegurosCompleto( ) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String query = "SELECT * from seguros";
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}

	public ArrayList<Seguro> obtenerTodosLosSeguros()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ArrayList<Seguro> lSeguro = new ArrayList<Seguro>();
		Connection cn = null;
		try
		{
			cn = DriverManager.getConnection(host+dbName,user,pass);
			String query = "Select * from seguros";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				Seguro x = new Seguro();
				x.setId(rs.getInt("idSeguro"));
				x.setDescripcion(rs.getString("descripcion"));
				x.setTipoSeguro(rs.getString("idTipo"));
				x.setCostoContratacion(Float.parseFloat(rs.getString("costoContratacion")));
				x.setCostoMaximoAsegurado(Float.parseFloat(rs.getString("costAsegurado")));
				
				
				lSeguro.add(x);
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return lSeguro;
		
	}
	
	public int listarSegurosParticular(int tipo ) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		String query = "SELECT * from seguros WHERE idTipo=" + tipo ;
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}
	
	
}
