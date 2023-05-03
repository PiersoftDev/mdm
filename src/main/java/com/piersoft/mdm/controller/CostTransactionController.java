package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.CostTransactionDTO;
import com.piersoft.mdm.api.request.dto.MaterialBudgetDTO;
import com.piersoft.mdm.api.request.mapper.CostTransactionMapper;
import com.piersoft.mdm.api.request.mapper.MaterialBudgetMapper;
import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.persistence.entities.MaterialBudget;
import com.piersoft.mdm.service.CostTransactionService;
import com.piersoft.mdm.service.MaterialBudgetService;
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
@RequestMapping("/v1/masters/cost-transaction")
public class CostTransactionController {
    private final Logger logger = LoggerFactory.getLogger(CostTransactionController.class);
    @Autowired
    private CostTransactionService costTransactionService;

    @Autowired
    private CostTransactionMapper costTransactionMapper;

    @ApiOperation(value = "Adds a Cost transaction for an item", notes = "Returns a Cost transaction id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a cost transaction for an item"),
            @ApiResponse(code = 404, message = "Not found - The cost transaction for an item not found")
    })
    @PostMapping("/addCostTransaction")
    public void addCostTransaction(@RequestBody CostTransactionDTO costTransactionDTO){
        logger.debug("Adding cost transaction with lnId:%s",costTransactionDTO.getLnId());
        CostTransaction costTransaction = costTransactionMapper.sourceToDestination(costTransactionDTO);
        costTransactionService.addCostTransaction(costTransaction);
        logger.debug("Successfully cost transaction with lnId:%s",costTransactionDTO.getLnId());
    }
}
