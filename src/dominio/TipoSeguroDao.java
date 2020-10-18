package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TipoSeguroDao {
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "password";
	private String dbName = "SegurosGroup";
	
	public TipoSeguroDao () {
		
	}
	
	public ArrayList<TipoSeguro> listarTodosLosSeguros()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection cn = null;

		ArrayList<TipoSeguro> lTipoSeguro = new ArrayList<TipoSeguro>();
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			String query = "SELECT * from tipoSeguros";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{	
				TipoSeguro x = new TipoSeguro();
				x.setId(rs.getInt("idTipo"));
				x.setTipoSeguro(rs.getString("descripcion"));
				lTipoSeguro.add(x);
			}
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return lTipoSeguro;
	}

}
