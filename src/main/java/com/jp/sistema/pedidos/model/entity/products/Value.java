package com.jp.sistema.pedidos.model.entity.products;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
    private String etag;
    private String No;
    private String Description;
    @JsonProperty("Description_2") 
    private String description_2;
    @JsonProperty("Type") 
    private String type;
    @JsonProperty("Inventory") 
    private int inventory;
    @JsonProperty("Qty_on_Purch_Order") 
    private int qty_on_Purch_Order;
    @JsonProperty("Created_From_Nonstock_Item") 
    private boolean created_From_Nonstock_Item;
    @JsonProperty("Substitutes_Exist") 
    private boolean substitutes_Exist;
    @JsonProperty("Stockkeeping_Unit_Exists") 
    private boolean stockkeeping_Unit_Exists;
    @JsonProperty("Assembly_BOM") 
    private boolean assembly_BOM;
    @JsonProperty("Production_BOM_No") 
    private String production_BOM_No;
    @JsonProperty("Routing_No") 
    private String routing_No;
    @JsonProperty("Base_Unit_of_Measure") 
    private String base_Unit_of_Measure;
    @JsonProperty("Shelf_No") 
    private String shelf_No;
    @JsonProperty("Costing_Method") 
    private String costing_Method;
    @JsonProperty("Cost_is_Adjusted") 
    private boolean cost_is_Adjusted;
    @JsonProperty("Standard_Cost") 
    private int standard_Cost;
    @JsonProperty("Low_Level_Code") 
    private int low_Level_Code;
    @JsonProperty("Unit_Cost") 
    private double unit_Cost;
    @JsonProperty("Last_Direct_Cost") 
    private double last_Direct_Cost;
    @JsonProperty("Price_Profit_Calculation") 
    private String price_Profit_Calculation;
    @JsonProperty("Profit_Percent") 
    private int profit_Percent;
    @JsonProperty("Unit_Price") 
    private int unit_Price;
    @JsonProperty("Inventory_Posting_Group") 
    private String inventory_Posting_Group;
    @JsonProperty("Gen_Prod_Posting_Group") 
    private String gen_Prod_Posting_Group;
    @JsonProperty("VAT_Prod_Posting_Group") 
    private String vAT_Prod_Posting_Group;
    @JsonProperty("Item_Disc_Group") 
    private String item_Disc_Group;
    @JsonProperty("Vendor_No") 
    private String vendor_No;
    @JsonProperty("Vendor_Item_No") 
    private String vendor_Item_No;
    @JsonProperty("Tariff_No") 
    private String tariff_No;
    @JsonProperty("Overhead_Rate") 
    private int overhead_Rate;
    @JsonProperty("Indirect_Cost_Percent") 
    private int indirect_Cost_Percent;
    @JsonProperty("Item_Category_Code") 
    private String item_Category_Code;
    @JsonProperty("Product_Group_Code") 
    private String product_Group_Code;
    @JsonProperty("Blocked") 
    private boolean blocked;
    @JsonProperty("Last_Date_Modified") 
    private String last_Date_Modified;
    @JsonProperty("Sales_Unit_of_Measure") 
    private String sales_Unit_of_Measure;
    @JsonProperty("Replenishment_System") 
    private String replenishment_System;
    @JsonProperty("Purch_Unit_of_Measure") 
    private String purch_Unit_of_Measure;
    @JsonProperty("Lead_Time_Calculation") 
    private String lead_Time_Calculation;
    @JsonProperty("Manufacturing_Policy") 
    private String manufacturing_Policy;
    @JsonProperty("Flushing_Method") 
    private String flushing_Method;
    @JsonProperty("Assembly_Policy") 
    private String assembly_Policy;
    @JsonProperty("Item_Tracking_Code") 
    private String item_Tracking_Code;
    @JsonProperty("Default_Deferral_Template_Code") 
    private String default_Deferral_Template_Code;
    @JsonProperty("Global_Dimension_1_Filter") 
    private String global_Dimension_1_Filter;
    @JsonProperty("Global_Dimension_2_Filter") 
    private String global_Dimension_2_Filter;
    @JsonProperty("Location_Filter") 
    private String location_Filter;
    @JsonProperty("Drop_Shipment_Filter") 
    private String drop_Shipment_Filter;
    @JsonProperty("Variant_Filter") 
    private String variant_Filter;
    @JsonProperty("Lot_No_Filter") 
    private String lot_No_Filter;
    @JsonProperty("Serial_No_Filter") 
    private String serial_No_Filter;
    @JsonProperty("Date_Filter") 
    private String date_Filter;
}
