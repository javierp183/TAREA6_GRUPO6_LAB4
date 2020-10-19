package dominio;

public class Seguro {
	private int idSeguro;
	private String Descripcion;
	private float CostoContratacion;
	private float CostoMaximoAsegurado;
	private int IdTipo;
	
	public Seguro()
	{
		
	}
	
	public Seguro(int idSeguro, String Descripcion, int IdTipo,float CostoContratacion, float CostoMaximoAsegurado) {
		super();
		this.idSeguro = idSeguro;
		this.Descripcion = Descripcion;
		this.IdTipo = IdTipo;
		this.CostoContratacion = CostoContratacion;
		this.CostoMaximoAsegurado = CostoMaximoAsegurado;
	}

	public int getIdSeguro() {
		return idSeguro;
	}

	public void setIdSeguro(int idSeguro) {
		this.idSeguro = idSeguro;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int IdTipo) {
		this.IdTipo = IdTipo;
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
		return "Seguro [idSeguro=" + idSeguro + ", Descripcion=" + Descripcion + ", CostoContratacion="
				+ CostoContratacion + ", CostoMaximoAsegurado=" + CostoMaximoAsegurado + ", IdTipo=" + IdTipo + "]";
	}
	
	

//	@Override
//	public String toString() {
//		return "Seguro [id=" + id + ", Descripcion=" + Descripcion + ", IdTipo=" + IdTipo
//				+ ", CostoContratacion=" + CostoContratacion + ", CostoMaximoAsegurado=" + CostoMaximoAsegurado + "]";
//	}
	

}
