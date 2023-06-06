package com.jp.sistema.pedidos.model.entity.detail;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Detalle {
    @JsonProperty("Document_Type") 
    public String Document_Type;
    @JsonProperty("Document_No") 
    public String Document_No;
    @JsonProperty("Line_No") 
    public int Line_No;
    @JsonProperty("Type") 
    public String Type;
    @JsonProperty("FilteredTypeField") 
    public String FilteredTypeField;
    @JsonProperty("No") 
    public String No;
    @JsonProperty("VAT_Prod_Posting_Group") 
    public String VAT_Prod_Posting_Group;
    @JsonProperty("Description") 
    public String Description;
    @JsonProperty("Location_Code") 
    public String Location_Code;
    @JsonProperty("Reserve") 
    public String Reserve;
    @JsonProperty("Quantity") 
    public int Quantity;
    @JsonProperty("Qty_to_Assemble_to_Order") 
    public int Qty_to_Assemble_to_Order;
    @JsonProperty("Reserved_Quantity") 
    public int Reserved_Quantity;
    @JsonProperty("Unit_Cost_LCY") 
    public int Unit_Cost_LCY;
    @JsonProperty("Unit_Price") 
    public int Unit_Price;
    @JsonProperty("Line_Discount_Percent") 
    public int Line_Discount_Percent;
    @JsonProperty("Line_Amount") 
    public int Line_Amount;
    @JsonProperty("Qty_to_Ship") 
    public int Qty_to_Ship;
    @JsonProperty("Qty_to_Invoice") 
    public int Qty_to_Invoice;
    @JsonProperty("Invoice_Discount_Amount") 
    public int Invoice_Discount_Amount;
    @JsonProperty("Invoice_Disc_Pct") 
    public int Invoice_Disc_Pct;
}
