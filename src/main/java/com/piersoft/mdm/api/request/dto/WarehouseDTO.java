package com.piersoft.mdm.api.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDTO {

    private String lnId;
    private String projectCode;
    private String whCode;
    private String whDesc;
    private String whType;
    private String whAddress;
    private String whCity;
    private String whState;
}
