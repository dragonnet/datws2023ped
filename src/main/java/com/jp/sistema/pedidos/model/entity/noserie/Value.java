package com.jp.sistema.pedidos.model.entity.noserie;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
    private String etag;
    @JsonProperty("Series_Code") 
    private String Series_Code;
    @JsonProperty("Line_No") 
    private int line_No;
    @JsonProperty("Starting_Date") 
    private String starting_Date;
    @JsonProperty("Starting_No") 
    private String starting_No;
    @JsonProperty("Ending_No") 
    private String ending_No;
    @JsonProperty("Last_Date_Used") 
    private String last_Date_Used;
    @JsonProperty("Last_No_Used") 
    private String Last_No_Used;
    @JsonProperty("Warning_No") 
    private String warning_No;
    @JsonProperty("Increment_by_No") 
    private int increment_by_No;
    @JsonProperty("Open") 
    private boolean open;
    @JsonProperty("Series") 
    private String series;
    @JsonProperty("Authorization_Code") 
    private int authorization_Code;
    @JsonProperty("Authorization_Year") 
    private int authorization_Year;
}
