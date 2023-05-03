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
public class ItemDTO {

    private String lnId;
    private String itemCode;
    private String itemDesc;
    private String itemType;
    private String itemGroupCode;
    private String itemGroupDesc;
    private String uomCode;
    private String uomDesc;
}
