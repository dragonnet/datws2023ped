package com.jp.sistema.pedidos.model.entity;

import lombok.Data;

@Data
public class Pedidos {

	private String codigo;
	private String descripcion;
	private Integer cantidad;
	private String customerid;
	private String nopedido;
	
	public Pedidos(String codigo, String descripcion, Double precio, Integer cantidad, String customer, String pedido) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.customerid = customer;
		this.nopedido = pedido;
	}
}
