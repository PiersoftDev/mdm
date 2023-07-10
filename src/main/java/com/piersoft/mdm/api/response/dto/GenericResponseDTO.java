package com.piersoft.mdm.api.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponseDTO {

    private HttpStatus statusCode;
    private Object  data;
    private String messageCode;
    private Boolean success;
    private List<String> errors;
}
