package ar.edu.unlam.pb2;

public class Indumentaria extends Producto{
	
	private String descripcion;
	private String talle;
	private String marca;
	private String color;
	
	public Indumentaria(Integer codigo, String descripcion, String talle,String marca, String color, Double precio) {
		super(codigo, precio);
		this.descripcion = descripcion;
		this.talle=talle;
		this.marca = marca;
		this.color=color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	
}
