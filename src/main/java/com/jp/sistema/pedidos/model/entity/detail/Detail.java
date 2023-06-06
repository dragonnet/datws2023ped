package com.jp.sistema.pedidos.model.entity.detail;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Detail {
    public String context;
    public String etag;
    @JsonProperty("Document_Type") 
    public String document_Type;
    @JsonProperty("Document_No") 
    public String document_No;
    @JsonProperty("Line_No") 
    public int line_No;
    @JsonProperty("Type") 
    public String type;
    @JsonProperty("FilteredTypeField") 
    public String filteredTypeField;
    @JsonProperty("No") 
    public String no;
    @JsonProperty("Cross_Reference_No") 
    public String cross_Reference_No;
    @JsonProperty("IC_Partner_Code") 
    public String iC_Partner_Code;
    @JsonProperty("IC_Partner_Ref_Type") 
    public String iC_Partner_Ref_Type;
    @JsonProperty("IC_Partner_Reference") 
    public String iC_Partner_Reference;
    @JsonProperty("Variant_Code") 
    public String variant_Code;
    @JsonProperty("Substitution_Available") 
    public boolean substitution_Available;
    @JsonProperty("Purchasing_Code") 
    public String purchasing_Code;
    @JsonProperty("Nonstock") 
    public boolean nonstock;
    @JsonProperty("VAT_Prod_Posting_Group") 
    public String vAT_Prod_Posting_Group;
    @JsonProperty("Description") 
    public String description;
    @JsonProperty("Description_2") 
    public String description_2;
    @JsonProperty("Drop_Shipment") 
    public boolean drop_Shipment;
    @JsonProperty("Special_Order") 
    public boolean special_Order;
    @JsonProperty("Return_Reason_Code") 
    public String return_Reason_Code;
    @JsonProperty("Package_Tracking_No") 
    public String package_Tracking_No;
    @JsonProperty("Location_Code") 
    public String location_Code;
    @JsonProperty("Bin_Code") 
    public String bin_Code;
    @JsonProperty("Reserve") 
    public String reserve;
    @JsonProperty("Quantity") 
    public int quantity;
    @JsonProperty("Qty_to_Assemble_to_Order") 
    public int qty_to_Assemble_to_Order;
    @JsonProperty("Reserved_Quantity") 
    public int reserved_Quantity;
    @JsonProperty("Unit_of_Measure_Code") 
    public String unit_of_Measure_Code;
    @JsonProperty("Unit_of_Measure") 
    public String unit_of_Measure;
    @JsonProperty("Unit_Cost_LCY") 
    public int unit_Cost_LCY;
    @JsonProperty("SalesPriceExist") 
    public boolean salesPriceExist;
    @JsonProperty("Unit_Price") 
    public int unit_Price;
    @JsonProperty("Tax_Liable") 
    public boolean tax_Liable;
    @JsonProperty("Tax_Area_Code") 
    public String tax_Area_Code;
    @JsonProperty("Tax_Group_Code") 
    public String tax_Group_Code;
    @JsonProperty("Line_Discount_Percent") 
    public int line_Discount_Percent;
    @JsonProperty("Line_Amount") 
    public int line_Amount;
    @JsonProperty("Amount_Including_VAT") 
    public int amount_Including_VAT;
    @JsonProperty("SalesLineDiscExists") 
    public boolean salesLineDiscExists;
    @JsonProperty("Line_Discount_Amount") 
    public int line_Discount_Amount;
    @JsonProperty("Prepayment_Percent") 
    public int prepayment_Percent;
    @JsonProperty("Prepmt_Line_Amount") 
    public int prepmt_Line_Amount;
    @JsonProperty("Prepmt_Amt_Inv") 
    public int prepmt_Amt_Inv;
    @JsonProperty("Allow_Invoice_Disc") 
    public boolean allow_Invoice_Disc;
    @JsonProperty("Inv_Discount_Amount") 
    public int inv_Discount_Amount;
    @JsonProperty("Inv_Disc_Amount_to_Invoice") 
    public int inv_Disc_Amount_to_Invoice;
    @JsonProperty("Qty_to_Ship") 
    public int qty_to_Ship;
    @JsonProperty("Quantity_Shipped") 
    public int quantity_Shipped;
    @JsonProperty("Qty_to_Invoice") 
    public int qty_to_Invoice;
    @JsonProperty("Quantity_Invoiced") 
    public int quantity_Invoiced;
    @JsonProperty("Prepmt_Amt_to_Deduct") 
    public int prepmt_Amt_to_Deduct;
    @JsonProperty("Prepmt_Amt_Deducted") 
    public int prepmt_Amt_Deducted;
    @JsonProperty("Allow_Item_Charge_Assignment") 
    public boolean allow_Item_Charge_Assignment;
    @JsonProperty("Qty_to_Assign") 
    public int qty_to_Assign;
    @JsonProperty("Qty_Assigned") 
    public int qty_Assigned;
    @JsonProperty("Requested_Delivery_Date") 
    public String requested_Delivery_Date;
    @JsonProperty("Promised_Delivery_Date") 
    public String promised_Delivery_Date;
    @JsonProperty("Planned_Delivery_Date") 
    public String planned_Delivery_Date;
    @JsonProperty("Planned_Shipment_Date") 
    public String planned_Shipment_Date;
    @JsonProperty("Shipment_Date") 
    public String shipment_Date;
    @JsonProperty("Shipping_Agent_Code") 
    public String shipping_Agent_Code;
    @JsonProperty("Shipping_Agent_Service_Code") 
    public String shipping_Agent_Service_Code;
    @JsonProperty("Shipping_Time") 
    public String shipping_Time;
    @JsonProperty("Work_Type_Code") 
    public String work_Type_Code;
    @JsonProperty("Whse_Outstanding_Qty") 
    public int whse_Outstanding_Qty;
    @JsonProperty("Whse_Outstanding_Qty_Base") 
    public int whse_Outstanding_Qty_Base;
    @JsonProperty("ATO_Whse_Outstanding_Qty") 
    public int aTO_Whse_Outstanding_Qty;
    @JsonProperty("ATO_Whse_Outstd_Qty_Base") 
    public int aTO_Whse_Outstd_Qty_Base;
    @JsonProperty("Outbound_Whse_Handling_Time") 
    public String outbound_Whse_Handling_Time;
    @JsonProperty("Blanket_Order_No") 
    public String blanket_Order_No;
    @JsonProperty("Blanket_Order_Line_No") 
    public int blanket_Order_Line_No;
    @JsonProperty("FA_Posting_Date") 
    public String fA_Posting_Date;
    @JsonProperty("Depr_until_FA_Posting_Date") 
    public boolean depr_until_FA_Posting_Date;
    @JsonProperty("Depreciation_Book_Code") 
    public String depreciation_Book_Code;
    @JsonProperty("Use_Duplication_List") 
    public boolean use_Duplication_List;
    @JsonProperty("Duplicate_in_Depreciation_Book") 
    public String duplicate_in_Depreciation_Book;
    @JsonProperty("Appl_from_Item_Entry") 
    public int appl_from_Item_Entry;
    @JsonProperty("Appl_to_Item_Entry") 
    public int appl_to_Item_Entry;
    @JsonProperty("Deferral_Code") 
    public String deferral_Code;
    @JsonProperty("Shortcut_Dimension_1_Code") 
    public String shortcut_Dimension_1_Code;
    @JsonProperty("Shortcut_Dimension_2_Code") 
    public String shortcut_Dimension_2_Code;
    @JsonProperty("ShortcutDimCode_x005B_3_x005D_") 
    public String shortcutDimCode_x005B_3_x005D_;
    @JsonProperty("ShortcutDimCode_x005B_4_x005D_") 
    public String shortcutDimCode_x005B_4_x005D_;
    @JsonProperty("ShortcutDimCode_x005B_5_x005D_") 
    public String shortcutDimCode_x005B_5_x005D_;
    @JsonProperty("ShortcutDimCode_x005B_6_x005D_") 
    public String shortcutDimCode_x005B_6_x005D_;
    @JsonProperty("ShortcutDimCode_x005B_7_x005D_") 
    public String shortcutDimCode_x005B_7_x005D_;
    @JsonProperty("ShortcutDimCode_x005B_8_x005D_") 
    public String shortcutDimCode_x005B_8_x005D_;
    @JsonProperty("TotalSalesLine_Line_Amount") 
    public int totalSalesLine_Line_Amount;
    @JsonProperty("Invoice_Discount_Amount") 
    public int invoice_Discount_Amount;
    @JsonProperty("Invoice_Disc_Pct") 
    public int invoice_Disc_Pct;
    @JsonProperty("GPesoNetoTotal") 
    public int gPesoNetoTotal;
    @JsonProperty("Total_Amount_Excl_VAT") 
    public int total_Amount_Excl_VAT;
    @JsonProperty("Total_VAT_Amount") 
    public int total_VAT_Amount;
    @JsonProperty("Total_Amount_Incl_VAT") 
    public int total_Amount_Incl_VAT;
}
