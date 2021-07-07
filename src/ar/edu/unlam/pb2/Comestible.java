package ar.edu.unlam.pb2;

public class Comestible extends Producto{

	private String descripcion;
	private String elaboracion;
	private String vencimiento;
	private String marca;
	
	public Comestible(Integer codigo, String descripcion, String elaboracion, String vencimiento, String marca, Double precio) {
		super(codigo, precio);
		this.descripcion = descripcion;
		this.elaboracion = elaboracion;
		this.vencimiento = vencimiento;
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFechaDeElaboracion() {
		return elaboracion;
	}


	public void setFechaDeElaboracion(String elaboracion) {
		this.elaboracion = elaboracion;
	}


	public String getFechaDeVencimiento() {
		return vencimiento;
	}


	public void setFechaDeVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
}
