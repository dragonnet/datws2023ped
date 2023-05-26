package com.jp.sistema.pedidos.model.entity.header;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Header {
    private String context;
    private String etag;
    @JsonProperty("Document_Type") 
    private String Document_Type;
    @JsonProperty("No") 
    private String No;
    @JsonProperty("Sell_to_Customer_No") 
    private String Sell_to_Customer_No;
    @JsonProperty("Sell_to_Customer_Name") 
    private String Sell_to_Customer_Name;
    @JsonProperty("SubType") 
    private String subType;
    @JsonProperty("Identify_Type") 
    private String identify_Type;
    @JsonProperty("Identify_No") 
    private String identify_No;
    @JsonProperty("Sell_to_Address") 
    private String sell_to_Address;
    @JsonProperty("Sell_to_Address_2") 
    private String sell_to_Address_2;
    @JsonProperty("Sell_to_City") 
    private String sell_to_City;
    @JsonProperty("Sell_to_County") 
    private String sell_to_County;
    @JsonProperty("Sell_to_Post_Code") 
    private String sell_to_Post_Code;
    @JsonProperty("Sell_to_Contact_No") 
    private String sell_to_Contact_No;
    @JsonProperty("Sell_to_Contact") 
    private String sell_to_Contact;
    @JsonProperty("No_of_Archived_Versions") 
    private int no_of_Archived_Versions;
    @JsonProperty("Ship") 
    private boolean ship;
    @JsonProperty("Posting_Date") 
    private String posting_Date;
    @JsonProperty("Document_Date") 
    private String document_Date;
    @JsonProperty("Order_Date") 
    private String order_Date;
    @JsonProperty("Due_Date") 
    private String due_Date;
    @JsonProperty("Posting_No") 
    private String posting_No;
    @JsonProperty("Requested_Delivery_Date") 
    private String requested_Delivery_Date;
    @JsonProperty("Promised_Delivery_Date") 
    private String promised_Delivery_Date;
    @JsonProperty("External_Document_No") 
    private String external_Document_No;
    @JsonProperty("Quote_No") 
    private String quote_No;
    @JsonProperty("Salesperson_Code") 
    private String salesperson_Code;
    @JsonProperty("Transaction_Specification") 
    private String transaction_Specification;
    @JsonProperty("Campaign_No") 
    private String campaign_No;
    @JsonProperty("Opportunity_No") 
    private String opportunity_No;
    @JsonProperty("Responsibility_Center") 
    private String responsibility_Center;
    @JsonProperty("Assigned_User_ID") 
    private String assigned_User_ID;
    @JsonProperty("Job_Queue_Status") 
    private String job_Queue_Status;
    @JsonProperty("Status") 
    private String status;
    @JsonProperty("Prepmt_Posting_Description") 
    private String prepmt_Posting_Description;
    @JsonProperty("ExtendTxt1") 
    private String extendTxt1;
    @JsonProperty("Tax_Area_Code") 
    private String tax_Area_Code;
    @JsonProperty("ExtendTxt5") 
    private String extendTxt5;
    @JsonProperty("ExtendTxt2") 
    private String extendTxt2;
    @JsonProperty("ExtendTxt4") 
    private String extendTxt4;
    @JsonProperty("ExtendTxt6") 
    private String extendTxt6;
    @JsonProperty("ExtendTxt7") 
    private String extendTxt7;
    @JsonProperty("WorkDescription") 
    private String workDescription;
    @JsonProperty("Bill_to_Customer_No") 
    private String bill_to_Customer_No;
    @JsonProperty("Currency_Code") 
    private String currency_Code;
    @JsonProperty("Payment_Terms_Code") 
    private String payment_Terms_Code;
    @JsonProperty("Payment_Method_Code") 
    private String payment_Method_Code;
    @JsonProperty("Tax_Liable") 
    private boolean tax_Liable;
    @JsonProperty("SelectedPayments") 
    private String selectedPayments;
    @JsonProperty("Transaction_Type") 
    private String transaction_Type;
    @JsonProperty("Shortcut_Dimension_1_Code") 
    private String shortcut_Dimension_1_Code;
    @JsonProperty("Shortcut_Dimension_2_Code") 
    private String shortcut_Dimension_2_Code;
    @JsonProperty("Payment_Discount_Percent") 
    private int payment_Discount_Percent;
    @JsonProperty("Pmt_Discount_Date") 
    private String pmt_Discount_Date;
    @JsonProperty("Direct_Debit_Mandate_ID") 
    private String direct_Debit_Mandate_ID;
    @JsonProperty("ShippingOptions") 
    private String shippingOptions;
    @JsonProperty("Ship_to_Code") 
    private String ship_to_Code;
    @JsonProperty("Ship_to_Name") 
    private String ship_to_Name;
    @JsonProperty("Ship_to_Address") 
    private String ship_to_Address;
    @JsonProperty("Ship_to_Address_2") 
    private String ship_to_Address_2;
    @JsonProperty("Ship_to_City") 
    private String ship_to_City;
    @JsonProperty("Ship_to_County") 
    private String ship_to_County;
    @JsonProperty("Ship_to_Post_Code") 
    private String ship_to_Post_Code;
    @JsonProperty("Ship_to_Country_Region_Code") 
    private String ship_to_Country_Region_Code;
    @JsonProperty("Ship_to_UPS_Zone") 
    private String ship_to_UPS_Zone;
    @JsonProperty("Dispatch_Area_Code") 
    private String dispatch_Area_Code;
    @JsonProperty("Dispatch_Area_Position") 
    private int dispatch_Area_Position;
    @JsonProperty("Monday") 
    private boolean monday;
    @JsonProperty("Tuesday") 
    private boolean tuesday;
    @JsonProperty("Wednesday") 
    private boolean wednesday;
    @JsonProperty("Thursday") 
    private boolean thursday;
    @JsonProperty("Friday") 
    private boolean friday;
    @JsonProperty("Saturday") 
    private boolean saturday;
    @JsonProperty("Sunday") 
    private boolean sunday;
    @JsonProperty("Start_Hour") 
    private String start_Hour;
    @JsonProperty("End_Hour") 
    private String end_Hour;
    @JsonProperty("Shipping_No") 
    private String shipping_No;
    @JsonProperty("Ship_to_Contact") 
    private String ship_to_Contact;
    @JsonProperty("Shipment_Method_Code") 
    private String shipment_Method_Code;
    @JsonProperty("Shipping_Agent_Code") 
    private String shipping_Agent_Code;
    @JsonProperty("Shipping_Agent_Service_Code") 
    private String shipping_Agent_Service_Code;
    @JsonProperty("Package_Tracking_No") 
    private String package_Tracking_No;
    @JsonProperty("BillToOptions") 
    private String billToOptions;
    @JsonProperty("Bill_to_Name") 
    private String bill_to_Name;
    @JsonProperty("Bill_to_Address") 
    private String bill_to_Address;
    @JsonProperty("Bill_to_Address_2") 
    private String bill_to_Address_2;
    @JsonProperty("Bill_to_City") 
    private String bill_to_City;
    @JsonProperty("Bill_to_County") 
    private String bill_to_County;
    @JsonProperty("Bill_to_Post_Code") 
    private String bill_to_Post_Code;
    @JsonProperty("Bill_to_Contact_No") 
    private String bill_to_Contact_No;
    @JsonProperty("Bill_to_Contact") 
    private String bill_to_Contact;
    @JsonProperty("Location_Code") 
    private String location_Code;
    @JsonProperty("Shipment_Date") 
    private String shipment_Date;
    @JsonProperty("Shipping_Advice") 
    private String shipping_Advice;
    @JsonProperty("Outbound_Whse_Handling_Time") 
    private String outbound_Whse_Handling_Time;
    @JsonProperty("Shipping_Time") 
    private String shipping_Time;
    @JsonProperty("Late_Order_Shipping") 
    private boolean late_Order_Shipping;
    @JsonProperty("Transport_Method") 
    private String transport_Method;
    @JsonProperty("Exit_Point") 
    private String exit_Point;
    @JsonProperty("Area") 
    private String area;
    @JsonProperty("Applies_to_Doc_Type") 
    private String applies_to_Doc_Type;
    @JsonProperty("Applies_to_Doc_No") 
    private String applies_to_Doc_No;
    @JsonProperty("Prepayment_Percent") 
    private int prepayment_Percent;
    @JsonProperty("Compress_Prepayment") 
    private boolean compress_Prepayment;
    @JsonProperty("Prepmt_Payment_Terms_Code") 
    private String prepmt_Payment_Terms_Code;
    @JsonProperty("Prepayment_Due_Date") 
    private String prepayment_Due_Date;
    @JsonProperty("Prepmt_Payment_Discount_Percent") 
    private int prepmt_Payment_Discount_Percent;
    @JsonProperty("Prepmt_Pmt_Discount_Date") 
    private String prepmt_Pmt_Discount_Date;
    @JsonProperty("Prepmt_Include_Tax") 
    private boolean prepmt_Include_Tax;
    @JsonProperty("Date_Filter") 
    private String date_Filter;
}
