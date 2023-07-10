package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.BusinessPartnerDTO;
import com.piersoft.mdm.api.request.mapper.BusinessPartnerMapper;
import com.piersoft.mdm.api.response.dto.GenericResponseDTO;
import com.piersoft.mdm.persistence.entities.BusinessPartner;
import com.piersoft.mdm.service.BusinessPartnerService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<GenericResponseDTO> addBusinessPartner(@RequestBody BusinessPartnerDTO businessPartnerDTO){
        logger.debug("Adding business partner with lnId::{}",businessPartnerDTO.getLnId());
        BusinessPartner businessPartner = businessPartnerMapper.toDTO(businessPartnerDTO);
        businessPartner = businessPartnerService.addBusinessPartner(businessPartner);
        logger.debug("Successfully business partner with lnId::{}",businessPartnerDTO.getLnId());
        return ResponseEntity.ok(GenericResponseDTO.builder().data(businessPartner).success(true).messageCode("Successfully added business partner").statusCode(HttpStatus.OK).build());
    }

    // search for a business partner by name
    @ApiOperation(value = "Search for a business partner", notes = "Returns a business partner", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully returns a business partner"),
            @ApiResponse(code = 404, message = "Not found - no business partner found")
    })
    @GetMapping("/searchBusinessPartner/{businessPartnerName}")
    public ResponseEntity<List<BusinessPartner>> searchBusinessPartner(@PathVariable String  businessPartnerName){
        logger.debug("Searching for a business partner by name that contains : {}", businessPartnerName);
        List<BusinessPartner> businessPartnerList = businessPartnerService.searchBusinessPartnerByName(businessPartnerName);
        logger.debug("Done searching for a business partner by name that contains : {}", businessPartnerName);
        return ResponseEntity.ok(businessPartnerList);
    }
}
