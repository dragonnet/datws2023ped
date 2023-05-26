package com.jp.sistema.pedidos.model.entity.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
	private String etag;
	private String No;
	private String Identif1;
	@JsonProperty("Identif2")
	private String identif2;
	@JsonProperty("Identif3")
	private String identif3;
	@JsonProperty("VAT_Registration_No")
	private String vAT_Registration_No;
	private String Name;
	@JsonProperty("Name_2")
	private String name_2;
	@JsonProperty("ExtendTxt6")
	private String extendTxt6;
	private String Address;
	@JsonProperty("Address_2")
	private String Address_2;
	private String City;
	@JsonProperty("Territory_Code")
	private String territory_Code;
	@JsonProperty("County")
	private String County;
	@JsonProperty("Customer_principal")
	private String customer_principal;
	@JsonProperty("Responsibility_Center")
	private String responsibility_Center;
	@JsonProperty("Location_Code")
	private String location_Code;
	@JsonProperty("Post_Code")
	private String post_Code;
	@JsonProperty("Country_Region_Code")
	private String country_Region_Code;
	@JsonProperty("Phone_No")
	private String phone_No;
	@JsonProperty("IC_Partner_Code")
	private String iC_Partner_Code;
	@JsonProperty("Contact")
	private String contact;
	@JsonProperty("ExtendTxt7")
	private String extendTxt7;
	@JsonProperty("Salesperson_Code")
	private String Salesperson_Code;
	@JsonProperty("Customer_Posting_Group")
	private String customer_Posting_Group;
	@JsonProperty("Gen_Bus_Posting_Group")
	private String gen_Bus_Posting_Group;
	@JsonProperty("VAT_Bus_Posting_Group")
	private String vAT_Bus_Posting_Group;
	@JsonProperty("Customer_Price_Group")
	private String customer_Price_Group;
	@JsonProperty("Customer_Disc_Group")
	private String customer_Disc_Group;
	@JsonProperty("Payment_Terms_Code")
	private String payment_Terms_Code;
	@JsonProperty("Reminder_Terms_Code")
	private String reminder_Terms_Code;
	@JsonProperty("Fin_Charge_Terms_Code")
	private String fin_Charge_Terms_Code;
	@JsonProperty("Currency_Code")
	private String currency_Code;
	@JsonProperty("Language_Code")
	private String language_Code;
	@JsonProperty("Search_Name")
	private String search_Name;
	@JsonProperty("Bono_Productos")
	private String bono_Productos;
	@JsonProperty("Credit_Limit_LCY")
	private double credit_Limit_LCY;
	@JsonProperty("Shipment_Method_Code")
	private String shipment_Method_Code;
	@JsonProperty("Blocked")
	private String blocked;
	@JsonProperty("Privacy_Blocked")
	private boolean privacy_Blocked;
	@JsonProperty("Type_Bonus")
	private String type_Bonus;
	@JsonProperty("Gira")
	private String gira;
	@JsonProperty("Last_Date_Modified")
	private String last_Date_Modified;
	@JsonProperty("Application_Method")
	private String application_Method;
	@JsonProperty("Combine_Shipments")
	private boolean combine_Shipments;
	@JsonProperty("Reserve")
	private String reserve;
	@JsonProperty("Shipping_Advice")
	private String shipping_Advice;
	@JsonProperty("Shipping_Agent_Code")
	private String shipping_Agent_Code;
	@JsonProperty("Base_Calendar_Code")
	private String base_Calendar_Code;
	@JsonProperty("Balance_LCY")
	private double balance_LCY;
	@JsonProperty("Balance_Due_LCY")
	private double balance_Due_LCY;
	@JsonProperty("Sales_LCY")
	private double sales_LCY;
	@JsonProperty("CFDI_Purpose")
	private String cFDI_Purpose;
	@JsonProperty("CFDI_Relation")
	private String cFDI_Relation;
	@JsonProperty("Global_Dimension_1_Filter")
	private String global_Dimension_1_Filter;
	@JsonProperty("Global_Dimension_2_Filter")
	private String global_Dimension_2_Filter;
	@JsonProperty("Currency_Filter")
	private String currency_Filter;
	@JsonProperty("Date_Filter")
	private String date_Filter;
}
