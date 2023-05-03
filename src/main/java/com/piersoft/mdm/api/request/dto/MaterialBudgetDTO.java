package com.piersoft.mdm.api.request.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaterialBudgetDTO {

    private String lnId;
    private String projectCode;
    private String planCode;
    private String activityCode;
    private String itemCode;
    private String itemType;
    private Double quantity;
    private String uom;
}
