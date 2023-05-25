package com.jp.sistema.pedidos.model.entity;

import lombok.Data;

@Data
public class CustomerNew {
	private String timestamp;
	private String no;
	private String name;
	private String address;
	private String city;
	private String contact;
	private String bloqueado;
	private String personCode;
}
