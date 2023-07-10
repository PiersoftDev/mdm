package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.ItemGroup;
import com.piersoft.mdm.persistence.repositories.ItemGroupRepository;
import com.piersoft.mdm.service.ItemGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemGroupServiceImpl implements ItemGroupService {

    @Autowired
    private ItemGroupRepository itemGroupRepository;


    @Override
    public ItemGroup saveItemGroup(ItemGroup itemGroup) {
       return  itemGroupRepository.save(itemGroup);
    }

    @Override
    public List<ItemGroup> searchItemGroup(String name) {
        return itemGroupRepository.searchByItemGroupName(name);
    }
}
