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
public class Warehouse {

    @Id
    private String lnId;
    private String projectCode;
    private String whCode;
    private String whDesc;
    private String whType;
    private String whAddress;
    private String whCity;
    private String whState;
}
