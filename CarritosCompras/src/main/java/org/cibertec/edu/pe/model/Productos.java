package org.cibertec.edu.pe.model;

import java.io.InputStream;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Productos {
	@Id
	private String IdProductos;
	private String Nombre;
	private String Descripcion;
	private double precio;
	private String stock;
	
	
	public Productos() {
		super();
	}


	public Productos(String idProductos, String nombre, String descripcion, double precio, String stock) {
		super();
		IdProductos = idProductos;
		Nombre = nombre;
		Descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}


	public String getIdProductos() {
		return IdProductos;
	}


	public void setIdProductos(String idProductos) {
		IdProductos = idProductos;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getStock() {
		return stock;
	}


	public void setStock(String stock) {
		this.stock = stock;
	}


	
	
}
