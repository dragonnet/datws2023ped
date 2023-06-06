package com.jp.sistema.pedidos.model.entity.noserie;

import java.util.ArrayList;

import lombok.Data;

@Data
public class NoSerie {
    private String context;
    private ArrayList<Value> value;
}
