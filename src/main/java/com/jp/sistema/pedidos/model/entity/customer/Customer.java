package com.jp.sistema.pedidos.model.entity.customer;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Customer {

	private String context;
	private ArrayList<Value> value;
	private String nextLink;

}
