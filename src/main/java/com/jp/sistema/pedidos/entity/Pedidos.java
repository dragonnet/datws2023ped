package com.jp.sistema.pedidos.entity;

import lombok.Data;

@Data
public class Pedidos {

	private String codigo;
	private String descripcion;
	private Double precio;
	private Double cantidad;
	private Double subtotal;
	
	public Pedidos(String codigo, String descripcion, Double precio, Double cantidad) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = precio*cantidad;
	}
}
