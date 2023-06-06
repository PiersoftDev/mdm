package com.piersoft.mdm.api.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO {

    private Long masterDataId;
    private String msg;
    private String errorMsg;
}
