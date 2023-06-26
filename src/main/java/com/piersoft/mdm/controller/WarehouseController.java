package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.WarehouseDTO;
import com.piersoft.mdm.api.request.mapper.WarehouseMapper;
import com.piersoft.mdm.persistence.entities.Warehouse;
import com.piersoft.mdm.service.WarehouseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller to handle requests for the warehouse
@RestController
@RequestMapping("/v1/masters/warehouse")
public class WarehouseController {

    private final Logger logger = LoggerFactory.getLogger(WarehouseController.class);

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private WarehouseService warehouseService;

    // create a warehouse
    @ApiOperation(value = "Create a warehouse", notes = "Returns a warehouse id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a warehouse"),
            @ApiResponse(code = 404, message = "Not found - The warehouse not found")
    })
    @PostMapping("/createWarehouse")
    public void createWarehouse(@RequestBody WarehouseDTO warehouseDTO){
        logger.debug("Adding warehouse with lnId: {}",warehouseDTO.getLnId());
        Warehouse warehouse = warehouseMapper.toEntity(warehouseDTO);
        warehouseService.createWarehouse(warehouse);
        logger.debug("Successfully created warehouse with lnId: {}",warehouseDTO.getLnId());
    }


    @ApiOperation(value = "Search for a warehouse", notes = "Returns a list of warehouses that matches warehouse name", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved warehouse"),
            @ApiResponse(code = 404, message = "Not found - The warehouse not found")
    })
    @PostMapping("/searchWarehouse/{name}")
    public ResponseEntity<List<Warehouse>> searchWarehouse(@PathVariable String name){
        logger.debug("Searching warehouse with name: {}",name);
        List<Warehouse> warehouse = warehouseService.searchWarehouse(name);
        logger.debug("Successfully retrieved warehouse with name: {}",name);
        return ResponseEntity.ok(warehouse);
    }

    //search warehouse by project code
    @ApiOperation(value = "Search for a warehouse", notes = "Returns a list of warehouses that matches project code", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved warehouse"),
            @ApiResponse(code = 404, message = "Not found - The warehouse not found")
    })
    @GetMapping("/searchWarehouseByProjectCode/{projectCode}")
    public ResponseEntity<List<Warehouse>> searchWarehouseByProjectCode(@PathVariable String projectCode){
        logger.debug("Searching warehouse with project code: {}",projectCode);
        List<Warehouse> warehouse = warehouseService.searchWarehouseByProjectCode(projectCode);
        logger.debug("Successfully retrieved warehouse with project code: {}",projectCode);
        return ResponseEntity.ok(warehouse);
    }


}
