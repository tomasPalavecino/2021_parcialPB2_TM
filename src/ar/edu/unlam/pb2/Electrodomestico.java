package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto{
	
	private String descripcion;
	private Integer garantia;
	private String marca;
	
	public Electrodomestico(Integer codigo, String descripcion, Integer garantia, String marca, Double precio) {
		super(codigo, precio);
		this.descripcion = descripcion;
		this.garantia = garantia;
		this.marca = marca;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Integer getGarantia() {
		return garantia;
	}


	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}

}
