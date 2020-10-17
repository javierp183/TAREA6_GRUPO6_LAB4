package dominio;

public class Seguro {
	private int id;
	private String Descripcion;
	private String TipoSeguro;
	private float CostoContratacion;
	private float CostoMaximoAsegurado;
	
	public Seguro()
	{
		
	}
	
	public Seguro(int id, String Descripcion, String TipoSeguro,float CostoContratacion, float CostoMaximoAsegurado) {
		super();
		this.id = id;
		this.Descripcion = Descripcion;
		this.TipoSeguro = TipoSeguro;
		this.CostoContratacion = CostoContratacion;
		this.CostoMaximoAsegurado = CostoMaximoAsegurado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getTipoSeguro() {
		return TipoSeguro;
	}

	public void setTipoSeguro(String tipoSeguro) {
		TipoSeguro = tipoSeguro;
	}

	public float getCostoContratacion() {
		return CostoContratacion;
	}

	public void setCostoContratacion(float costoContratacion) {
		CostoContratacion = costoContratacion;
	}

	public float getCostoMaximoAsegurado() {
		return CostoMaximoAsegurado;
	}

	public void setCostoMaximoAsegurado(float costoMaximoAsegurado) {
		CostoMaximoAsegurado = costoMaximoAsegurado;
	}

	@Override
	public String toString() {
		return "Seguro [id=" + id + ", Descripcion=" + Descripcion + ", TipoSeguro=" + TipoSeguro
				+ ", CostoContratacion=" + CostoContratacion + ", CostoMaximoAsegurado=" + CostoMaximoAsegurado + "]";
	}
	

}
