package com.piersoft.mdm.persistence.entities;


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
@Entity
public class CostTransaction {

    @Id
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
