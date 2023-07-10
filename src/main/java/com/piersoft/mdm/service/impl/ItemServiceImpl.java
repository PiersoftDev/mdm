package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.Item;
import com.piersoft.mdm.persistence.repositories.ItemRepository;
import com.piersoft.mdm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getListOfItemsMatchingDesc(String desc) {
        return itemRepository.searchByItemDesc(desc);
    }
}
