package com.jp.sistema.pedidos.model.entity.header;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Encabezado {
    @JsonProperty("Document_Type") 
    private String Document_Type;
    @JsonProperty("Sell_to_Customer_No") 
    private String Sell_to_Customer_No;
    @JsonProperty("Sell_to_Customer_Name") 
    private String Sell_to_Customer_Name;
    @JsonProperty("SubType") 
    private String SubType;
    @JsonProperty("Identify_Type") 
    private String Identify_Type;
    @JsonProperty("Identify_No") 
    private String Identify_No;
    @JsonProperty("Sell_to_Address") 
    private String Sell_to_Address;
    @JsonProperty("Sell_to_Address_2") 
    private String Sell_to_Address_2;
    @JsonProperty("Sell_to_County") 
    private String Sell_to_County;
    @JsonProperty("Salesperson_Code") 
    private String Salesperson_Code;
    @JsonProperty("Bill_to_Customer_No") 
    private String Bill_to_Customer_No;
}
