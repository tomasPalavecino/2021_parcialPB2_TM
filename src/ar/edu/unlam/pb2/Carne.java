package ar.edu.unlam.pb2;

public class Carne extends Comestible {
	
	private Double kilos;

	public Carne(Integer codigo, String descripcion, String elaboracion, String vencimiento, Double kilos, String marca, Double precio) {
		super(codigo, descripcion, elaboracion, vencimiento, marca, precio);
		this.kilos=kilos;
	}

	public Double getKilos() {
		return kilos;
	}

	public void setKilos(Double peso) {
		this.kilos = kilos;
	}
}
