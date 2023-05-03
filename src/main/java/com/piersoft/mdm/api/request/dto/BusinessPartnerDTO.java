package com.piersoft.mdm.api.request.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusinessPartnerDTO {

    private String lnId;
    private String bpCode;
    private String bpDesc;
}
