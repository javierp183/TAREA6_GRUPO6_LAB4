package dominio;

public class TipoSeguro {
	private int id;
	private String TipoSeguro;
	
	public TipoSeguro()
	{
		
	}
	
	public TipoSeguro(int id, String TipoSeguro) {
		super();
		this.id = id;
		this.TipoSeguro = TipoSeguro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoSeguro() {
		return TipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		TipoSeguro = tipoSeguro;
	}

	@Override
	public String toString() {
		return "TipoSeguro [id=" + id + ", TipoSeguro=" + TipoSeguro + "]";
	}
	

}
