package com.piersoft.mdm.api.request.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CostTransactionDTO {

    private String lnId;
    private String projectCode;
    private String element;
    private String activity;
    private String plan;
    private String costObject;
    private String origin;
    private String postingType;
    private Double quantity;
    private String uom;
    private Double inventoryOnOrder;
    private Double procuredTillDate;
    private Double inventoryOnHand;

}
