package dominio;

public class Seguro {
	private static int incremental = 0;
	private int id;
	private String Descripcion;
	private float CostoContratacion;
	private float CostoMaximoAsegurado;
	private int IdTipo;
	
	public Seguro()
	{
		
	}
	
	public Seguro(int id, String Descripcion, int IdTipo,float CostoContratacion, float CostoMaximoAsegurado) {
		super();
		this.id = incremental++;
		this.Descripcion = Descripcion;
		this.IdTipo = IdTipo;
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

	public int getIdTipo() {
		return IdTipo;
	}

	public void setIdTipo(int IdTipo) {
		IdTipo = IdTipo;
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
		return "Seguro [id=" + id + ", Descripcion=" + Descripcion + ", IdTipo=" + IdTipo
				+ ", CostoContratacion=" + CostoContratacion + ", CostoMaximoAsegurado=" + CostoMaximoAsegurado + "]";
	}
	

}
