package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	
	private Boolean frost;

	public Heladera(Integer codigo, String descripcion, Boolean frost,Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, garantia, marca, precio);
		this.frost=frost;
	}

	public Boolean isNoFrost() {
		return frost;
	}

	public void setIsNoFrost(Boolean frost) {
		this.frost = frost;
	}

}
