package com.jp.sistema.pedidos.model.entity.header;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
    public String context;
    public String etag;
    @JsonProperty("Document_Type") 
    public String Document_Type;
    @JsonProperty("No") 
    public String No;
    @JsonProperty("Sell_to_Customer_No") 
    public String Sell_to_Customer_No;
    @JsonProperty("Sell_to_Customer_Name") 
    public String Sell_to_Customer_Name;
    @JsonProperty("SubType") 
    public String subType;
    @JsonProperty("Identify_Type") 
    public String identify_Type;
    @JsonProperty("Identify_No") 
    public String identify_No;
    @JsonProperty("Sell_to_Address") 
    public String sell_to_Address;
    @JsonProperty("Sell_to_Address_2") 
    public String sell_to_Address_2;
    @JsonProperty("Sell_to_City") 
    public String sell_to_City;
    @JsonProperty("Sell_to_County") 
    public String sell_to_County;
    @JsonProperty("Sell_to_Post_Code") 
    public String sell_to_Post_Code;
    @JsonProperty("Sell_to_Contact_No") 
    public String sell_to_Contact_No;
    @JsonProperty("Sell_to_Contact") 
    public String sell_to_Contact;
    @JsonProperty("No_of_Archived_Versions") 
    public int no_of_Archived_Versions;
    @JsonProperty("Ship") 
    public boolean ship;
    @JsonProperty("Posting_Date") 
    public String posting_Date;
    @JsonProperty("Document_Date") 
    public String document_Date;
    @JsonProperty("Order_Date") 
    public String order_Date;
    @JsonProperty("Due_Date") 
    public String due_Date;
    @JsonProperty("Posting_No") 
    public String posting_No;
    @JsonProperty("Requested_Delivery_Date") 
    public String requested_Delivery_Date;
    @JsonProperty("Promised_Delivery_Date") 
    public String promised_Delivery_Date;
    @JsonProperty("External_Document_No") 
    public String external_Document_No;
    @JsonProperty("Quote_No") 
    public String quote_No;
    @JsonProperty("Salesperson_Code") 
    public String salesperson_Code;
    @JsonProperty("Transaction_Specification") 
    public String transaction_Specification;
    @JsonProperty("Campaign_No") 
    public String campaign_No;
    @JsonProperty("Opportunity_No") 
    public String opportunity_No;
    @JsonProperty("Responsibility_Center") 
    public String responsibility_Center;
    @JsonProperty("Assigned_User_ID") 
    public String assigned_User_ID;
    @JsonProperty("Job_Queue_Status") 
    public String job_Queue_Status;
    @JsonProperty("Status") 
    public String status;
    @JsonProperty("Prepmt_Posting_Description") 
    public String prepmt_Posting_Description;
    @JsonProperty("ExtendTxt1") 
    public String extendTxt1;
    @JsonProperty("Tax_Area_Code") 
    public String tax_Area_Code;
    @JsonProperty("ExtendTxt5") 
    public String extendTxt5;
    @JsonProperty("ExtendTxt2") 
    public String extendTxt2;
    @JsonProperty("ExtendTxt4") 
    public String extendTxt4;
    @JsonProperty("ExtendTxt6") 
    public String extendTxt6;
    @JsonProperty("ExtendTxt7") 
    public String extendTxt7;
    @JsonProperty("WorkDescription") 
    public String workDescription;
    @JsonProperty("Bill_to_Customer_No") 
    public String bill_to_Customer_No;
    @JsonProperty("Currency_Code") 
    public String currency_Code;
    @JsonProperty("Payment_Terms_Code") 
    public String payment_Terms_Code;
    @JsonProperty("Payment_Method_Code") 
    public String payment_Method_Code;
    @JsonProperty("Tax_Liable") 
    public boolean tax_Liable;
    @JsonProperty("SelectedPayments") 
    public String selectedPayments;
    @JsonProperty("Transaction_Type") 
    public String transaction_Type;
    @JsonProperty("Shortcut_Dimension_1_Code") 
    public String shortcut_Dimension_1_Code;
    @JsonProperty("Shortcut_Dimension_2_Code") 
    public String shortcut_Dimension_2_Code;
    @JsonProperty("Payment_Discount_Percent") 
    public int payment_Discount_Percent;
    @JsonProperty("Pmt_Discount_Date") 
    public String pmt_Discount_Date;
    @JsonProperty("Direct_Debit_Mandate_ID") 
    public String direct_Debit_Mandate_ID;
    @JsonProperty("ShippingOptions") 
    public String shippingOptions;
    @JsonProperty("Ship_to_Code") 
    public String ship_to_Code;
    @JsonProperty("Ship_to_Name") 
    public String ship_to_Name;
    @JsonProperty("Ship_to_Address") 
    public String ship_to_Address;
    @JsonProperty("Ship_to_Address_2") 
    public String ship_to_Address_2;
    @JsonProperty("Ship_to_City") 
    public String ship_to_City;
    @JsonProperty("Ship_to_County") 
    public String ship_to_County;
    @JsonProperty("Ship_to_Post_Code") 
    public String ship_to_Post_Code;
    @JsonProperty("Ship_to_Country_Region_Code") 
    public String ship_to_Country_Region_Code;
    @JsonProperty("Ship_to_UPS_Zone") 
    public String ship_to_UPS_Zone;
    @JsonProperty("Dispatch_Area_Code") 
    public String dispatch_Area_Code;
    @JsonProperty("Dispatch_Area_Position") 
    public int dispatch_Area_Position;
    @JsonProperty("Monday") 
    public boolean monday;
    @JsonProperty("Tuesday") 
    public boolean tuesday;
    @JsonProperty("Wednesday") 
    public boolean wednesday;
    @JsonProperty("Thursday") 
    public boolean thursday;
    @JsonProperty("Friday") 
    public boolean friday;
    @JsonProperty("Saturday") 
    public boolean saturday;
    @JsonProperty("Sunday") 
    public boolean sunday;
    @JsonProperty("Start_Hour") 
    public String start_Hour;
    @JsonProperty("End_Hour") 
    public String end_Hour;
    @JsonProperty("Shipping_No") 
    public String shipping_No;
    @JsonProperty("Ship_to_Contact") 
    public String ship_to_Contact;
    @JsonProperty("Shipment_Method_Code") 
    public String shipment_Method_Code;
    @JsonProperty("Shipping_Agent_Code") 
    public String shipping_Agent_Code;
    @JsonProperty("Shipping_Agent_Service_Code") 
    public String shipping_Agent_Service_Code;
    @JsonProperty("Package_Tracking_No") 
    public String package_Tracking_No;
    @JsonProperty("BillToOptions") 
    public String billToOptions;
    @JsonProperty("Bill_to_Name") 
    public String bill_to_Name;
    @JsonProperty("Bill_to_Address") 
    public String bill_to_Address;
    @JsonProperty("Bill_to_Address_2") 
    public String bill_to_Address_2;
    @JsonProperty("Bill_to_City") 
    public String bill_to_City;
    @JsonProperty("Bill_to_County") 
    public String bill_to_County;
    @JsonProperty("Bill_to_Post_Code") 
    public String bill_to_Post_Code;
    @JsonProperty("Bill_to_Contact_No") 
    public String bill_to_Contact_No;
    @JsonProperty("Bill_to_Contact") 
    public String bill_to_Contact;
    @JsonProperty("Location_Code") 
    public String location_Code;
    @JsonProperty("Shipment_Date") 
    public String shipment_Date;
    @JsonProperty("Shipping_Advice") 
    public String shipping_Advice;
    @JsonProperty("Outbound_Whse_Handling_Time") 
    public String outbound_Whse_Handling_Time;
    @JsonProperty("Shipping_Time") 
    public String shipping_Time;
    @JsonProperty("Late_Order_Shipping") 
    public boolean late_Order_Shipping;
    @JsonProperty("Transport_Method") 
    public String transport_Method;
    @JsonProperty("Exit_Point") 
    public String exit_Point;
    @JsonProperty("Area") 
    public String area;
    @JsonProperty("Applies_to_Doc_Type") 
    public String applies_to_Doc_Type;
    @JsonProperty("Applies_to_Doc_No") 
    public String applies_to_Doc_No;
    @JsonProperty("Prepayment_Percent") 
    public int prepayment_Percent;
    @JsonProperty("Compress_Prepayment") 
    public boolean compress_Prepayment;
    @JsonProperty("Prepmt_Payment_Terms_Code") 
    public String prepmt_Payment_Terms_Code;
    @JsonProperty("Prepayment_Due_Date") 
    public String prepayment_Due_Date;
    @JsonProperty("Prepmt_Payment_Discount_Percent") 
    public int prepmt_Payment_Discount_Percent;
    @JsonProperty("Prepmt_Pmt_Discount_Date") 
    public String prepmt_Pmt_Discount_Date;
    @JsonProperty("Prepmt_Include_Tax") 
    public boolean prepmt_Include_Tax;
    @JsonProperty("Date_Filter") 
    public String date_Filter;
}
