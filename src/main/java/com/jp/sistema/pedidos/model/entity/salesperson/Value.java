package com.jp.sistema.pedidos.model.entity.salesperson;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
    private String etag;
    private String Code;
    private String Name;
    @JsonProperty("Commission_Percent") 
    private int commission_Percent;
    @JsonProperty("E_Mail_2") 
    private String e_Mail_2;
    @JsonProperty("Phone_No") 
    private String phone_No;
    @JsonProperty("Privacy_Blocked") 
    private boolean privacy_Blocked;
    @JsonProperty("Salesperson_Supervisor") 
    private String salesperson_Supervisor;
}
