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
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String lnId;
    private String itemCode;
    private String itemDesc;
    private String itemType;
    private String itemGroupCode;
    private String itemGroupDesc;
    private String uomCode;
    private String uomDesc;
}
