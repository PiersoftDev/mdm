package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.BusinessPartnerDTO;
import com.piersoft.mdm.api.request.dto.CostTransactionDTO;
import com.piersoft.mdm.api.request.mapper.BusinessPartnerMapper;
import com.piersoft.mdm.api.request.mapper.CostTransactionMapper;
import com.piersoft.mdm.persistence.entities.BusinessPartner;
import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.service.BusinessPartnerService;
import com.piersoft.mdm.service.CostTransactionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/masters/business-partner")
public class BusinessPartnerController {
    private final Logger logger = LoggerFactory.getLogger(BusinessPartnerController.class);
    @Autowired
    private BusinessPartnerService businessPartnerService;

    @Autowired
    private BusinessPartnerMapper businessPartnerMapper;

    @ApiOperation(value = "Adds a business partner", notes = "Returns a business partner id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a business partner"),
            @ApiResponse(code = 404, message = "Not found - The business partner not found")
    })
    @PostMapping("/addBusinessPartner")
    public void addBusinessPartner(@RequestBody BusinessPartnerDTO businessPartnerDTO){
        logger.debug("Adding business partner with lnId:%s",businessPartnerDTO.getLnId());
        BusinessPartner businessPartner = businessPartnerMapper.sourceToDestination(businessPartnerDTO);
        businessPartnerService.addBusinessPartner(businessPartner);
        logger.debug("Successfully business partner with lnId:%s",businessPartnerDTO.getLnId());
    }
}
