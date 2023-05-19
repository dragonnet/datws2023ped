package com.jp.sistema.pedidos.model.entity.products;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Products {
    public String context;
    public ArrayList<Value> value;
    public String nextLink;
}
