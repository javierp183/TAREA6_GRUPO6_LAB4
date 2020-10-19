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
	

	public int agregarSeguro(Seguro seguro) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String query = "Insert into seguros(idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) values "
				+ "('"+seguro.getIdSeguro()+"','"+seguro.getDescripcion()+"','"+seguro.getIdTipo()+"','"+seguro.getCostoContratacion()+"','"+seguro.getCostoMaximoAsegurado()+"')";

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
	
	public ArrayList<TipoSeguro> listarTodosLosSeguros()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String query = "SELECT * from tipoSeguros";
		
		Connection cn = null;
		int filas=0;
		ArrayList<TipoSeguro> lTipoSeguro = new ArrayList<TipoSeguro>();
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				TipoSeguro x = new TipoSeguro();
				x.setId(rs.getInt("id"));
				x.setTipoSeguro(rs.getString("descripcion"));
				lTipoSeguro.add(x);
			}
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return lTipoSeguro;
	}

	public ArrayList<Seguro> obtenerTodosLosSeguros()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("lista todos los seguros");
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
				x.setIdSeguro(rs.getInt("idSeguro"));
				x.setDescripcion(rs.getString("descripcion"));
				x.setIdTipo(rs.getInt("idTipo"));
				x.setCostoContratacion(Float.parseFloat(rs.getString("costoContratacion")));
				x.setCostoMaximoAsegurado(Float.parseFloat(rs.getString("costoAsegurado")));
				
				lSeguro.add(x);
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return lSeguro;
		
	}
	
	public ArrayList<Seguro> listarSegurosPorTipoDeSeguro(int tipo) {
		
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
			String query = "SELECT * from seguros WHERE idTipo=" + tipo ;
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				Seguro x = new Seguro();
				x.setIdSeguro(rs.getInt("idSeguro"));
				x.setDescripcion(rs.getString("descripcion"));
				x.setIdTipo(rs.getInt("idTipo"));
				x.setCostoContratacion(Float.parseFloat(rs.getString("costoContratacion")));
				x.setCostoMaximoAsegurado(Float.parseFloat(rs.getString("costoAsegurado")));
				
				lSeguro.add(x);
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return lSeguro;

	}
	
	
}
