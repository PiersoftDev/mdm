package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.MaterialBudgetDTO;
import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.api.request.mapper.MaterialBudgetMapper;
import com.piersoft.mdm.api.request.mapper.ProjectActivityMapper;
import com.piersoft.mdm.persistence.entities.MaterialBudget;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import com.piersoft.mdm.service.MaterialBudgetService;
import com.piersoft.mdm.service.ProjectActivityService;
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
@RequestMapping("/v1/masters/material-budget")
public class MaterialBudgetController {
    private final Logger logger = LoggerFactory.getLogger(MaterialBudgetController.class);
    @Autowired
    private MaterialBudgetService materialBudgetService;

    @Autowired
    private MaterialBudgetMapper materialBudgetMapper;

    @ApiOperation(value = "Adds material budget", notes = "Returns a material budget id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a material budget entity"),
            @ApiResponse(code = 404, message = "Not found - The material budget not found")
    })
    @PostMapping("/addMaterialBudget")
    public void addMaterialBudget(@RequestBody MaterialBudgetDTO materialBudgetDTO){
        logger.debug("Adding material budget with lnId:%s",materialBudgetDTO.getLnId());
        MaterialBudget materialBudget = materialBudgetMapper.sourceToDestination(materialBudgetDTO);
        materialBudgetService.addMaterialBudget(materialBudget);
        logger.debug("Successfully added material budget with lnId:%s",materialBudgetDTO.getLnId());
    }
}
