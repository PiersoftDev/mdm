package com.piersoft.mdm.controller;


import com.piersoft.mdm.api.request.dto.ItemGroupDTO;
import com.piersoft.mdm.api.request.mapper.ItemGroupMapper;
import com.piersoft.mdm.api.response.dto.GenericResponseDTO;
import com.piersoft.mdm.persistence.entities.ItemGroup;
import com.piersoft.mdm.persistence.repositories.ItemGroupRepository;
import com.piersoft.mdm.service.ItemGroupService;
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
@RequestMapping("/v1/masters/item-group")
public class ItemGroupController {

    private static final Logger logger = LoggerFactory.getLogger(ItemGroupController.class);

    @Autowired
    private ItemGroupService itemGroupService;

    @Autowired
    private ItemGroupMapper itemGroupMapper;

    @ApiOperation(value = "Search for an item group", notes = "Returns a list of item groups that matches item group name", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved item group"),
            @ApiResponse(code = 404, message = "Not found - The item group not found")
    })
    @GetMapping("/searchItemGroup/{name}")
    public ResponseEntity<List<ItemGroup>> searchItemGroup(@PathVariable String name){
        logger.debug("Searching item group with name: {}",name);
        List<ItemGroup> itemGroup = itemGroupService.searchItemGroup(name);
        logger.debug("Successfully retrieved item group with name: {}",name);
        return ResponseEntity.ok(itemGroup);
    }

    @ApiOperation(value = "Save item group", notes = "Returns a list of item groups that matches item group name", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved item group"),
            @ApiResponse(code = 404, message = "Not found - The item group not found")
    })
    @PostMapping("/saveItemGroup")
    public ResponseEntity<GenericResponseDTO> saveItemGroup(@RequestBody ItemGroupDTO itemGroupDTO){
        logger.debug("Saving item group with name: {} and lnId: {}",itemGroupDTO.getItemGroupDesc(),itemGroupDTO.getLnId());
        ItemGroup itemGroup = itemGroupMapper.toEntity(itemGroupDTO);
        itemGroup = itemGroupService.saveItemGroup(itemGroup);
        logger.debug("Successfully saved item group with name: {} and lnId: {}",itemGroupDTO.getItemGroupDesc(),itemGroupDTO.getLnId());
        return ResponseEntity.ok(GenericResponseDTO.builder().data(itemGroup).statusCode(HttpStatus.OK).success(true).messageCode("Successfully added item group").build());
    }

}
