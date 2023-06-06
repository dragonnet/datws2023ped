package com.jp.sistema.pedidos.model.entity.usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Value {
    private String etag;
    @JsonProperty("User_ID") 
    private String User_ID;
    @JsonProperty("Allow_View_All_Document") 
    private boolean allow_View_All_Document;
    @JsonProperty("Allow_Posting_From") 
    private String allow_Posting_From;
    @JsonProperty("Allow_Posting_To") 
    private String allow_Posting_To;
    @JsonProperty("Register_Time") 
    private boolean register_Time;
    @JsonProperty("Salespers_Purch_Code") 
    private String salespers_Purch_Code;
    @JsonProperty("Dispositive") 
    private String dispositive;
    @JsonProperty("Cash_Recpt_Jnl_Template") 
    private String cash_Recpt_Jnl_Template;
    @JsonProperty("Cash_Recpt_Jnl_Batch") 
    private String cash_Recpt_Jnl_Batch;
    @JsonProperty("Bank_Account_No") 
    private String bank_Account_No;
    @JsonProperty("Sales_Resp_Ctr_Filter") 
    private String sales_Resp_Ctr_Filter;
    @JsonProperty("Purchase_Resp_Ctr_Filter") 
    private String purchase_Resp_Ctr_Filter;
    @JsonProperty("Service_Resp_Ctr_Filter") 
    private String service_Resp_Ctr_Filter;
    @JsonProperty("Time_Sheet_Admin") 
    private boolean time_Sheet_Admin;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("Allow_Payroll_Calc_Trace") 
    private boolean allow_Payroll_Calc_Trace;
    @JsonProperty("Allow_Delete_POS_wPaym_Applied") 
    private boolean allow_Delete_POS_wPaym_Applied;
    @JsonProperty("Budget_Check_Override") 
    private boolean budget_Check_Override;
    @JsonProperty("Generates_Purchase_Quotes") 
    private boolean generates_Purchase_Quotes;
    @JsonProperty("Can_Regen_Purchase_Quotes") 
    private boolean can_Regen_Purchase_Quotes;
    @JsonProperty("Allow_Authorize_Limit_Credit") 
    private boolean allow_Authorize_Limit_Credit;
    @JsonProperty("Shortcut_Dimension_1_Code") 
    private String shortcut_Dimension_1_Code;
    @JsonProperty("Allow_Autorize_Flag_Deliver") 
    private boolean allow_Autorize_Flag_Deliver;
    @JsonProperty("Allow_Change_Sub_Type") 
    private boolean allow_Change_Sub_Type;
}
