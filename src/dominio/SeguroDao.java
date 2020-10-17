package dominio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class SeguroDao {
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "password";
	private String dbName = "SegurosGroup";
	
	
	public SeguroDao () {
	}
	
	
	public int agregarSeguro(int id, String descripcion, String tiposeguro, int costocontratacion, int costomax ) {
		String query = "INSERT INTO seguros(idSeguro, descripcion, idTipo, costoContratacion, costoAsegurado) VALUES "
				+ "('"+ id + "','" + descripcion + "','" + tiposeguro  + "','" + costocontratacion  + "','" +costomax + "')";
		
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
	
	public int listarSegurosParticular(int tipo ) {
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
