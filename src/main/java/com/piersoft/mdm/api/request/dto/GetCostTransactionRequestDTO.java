package com.piersoft.mdm.api.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCostTransactionRequestDTO {
    private String projectCode;
    private String activityCode;
    private String itemCode;
}
