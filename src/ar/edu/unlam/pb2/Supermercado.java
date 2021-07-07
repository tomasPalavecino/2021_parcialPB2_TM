package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
//	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta
	
	public Supermercado(String nombre) {
		this.nombre=nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
	}
	
	
	public Producto buscarProducto(Producto producto) {
		for (Producto productoBuscar : productosExistentes) {
			if(productoBuscar.getCodigo().equals(producto.getCodigo())) {
				return productoBuscar;
			}
		}
		return null;
	}
	
	
	public void ingresarProducto(Producto nuevo) {
		this.productosExistentes.add(nuevo);
	
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		return this.productosExistentes.size();
	}
	
//	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
//		// Verifica si un producto existe
//	}
//	
//	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
//		// Busca la disponibilidad de un producto
//	}
//	
//	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
//		// Registra una nueva venta
//		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
//		return contadorDeVentas;
//	}
//	
//	public Venta getVenta(Integer nueroDeVenta) {
//		// Devuelve una venta en funci�n de su n�mero identificatorio
//	}
//
//	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
//		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
//	}
//	

}
