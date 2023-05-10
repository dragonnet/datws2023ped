package com.jp.sistema.pedidos.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer{

	private String timestamp;

	private String no;
	@Column(name="Name")
	private String name;
	@Column(name="Address", nullable = true)
	private String address;
	@Column(name="City")
	private String city;
	@Column(name="Contact", nullable = true)
	private String contact;
	@Column(name="Bloqueado", nullable = true)
	private String bloqueado;
	
	
	@Id
	@Column(name = "timestamp", unique = true, nullable = false)
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	@Column(name="No_")
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(String bloqueado) {
		this.bloqueado = bloqueado;
	}
	
}
