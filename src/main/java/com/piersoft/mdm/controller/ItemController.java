package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.ItemDTO;
import com.piersoft.mdm.api.request.dto.MaterialBudgetDTO;
import com.piersoft.mdm.api.request.mapper.ItemMapper;
import com.piersoft.mdm.api.request.mapper.MaterialBudgetMapper;
import com.piersoft.mdm.persistence.entities.Item;
import com.piersoft.mdm.persistence.entities.MaterialBudget;
import com.piersoft.mdm.service.ItemService;
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
@RequestMapping("/v1/masters/items")
public class ItemController {

    private final Logger logger = LoggerFactory.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemMapper itemMapper;

    @ApiOperation(value = "Adds item", notes = "Returns a item id id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a item entity"),
            @ApiResponse(code = 404, message = "Not found - The item not found")
    })
    @PostMapping("/addItem")
    public void addItem(@RequestBody ItemDTO itemDTO){
        logger.debug("Adding item with lnId:%s",itemDTO.getLnId());
        Item item = itemMapper.sourceToDestination(itemDTO);
        itemService.addItem(item);
        logger.debug("Successfully added item with lnId:%s",itemDTO.getLnId());
    }
}
