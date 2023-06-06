package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.Item;

import java.util.List;

public interface ItemService {

    void addItem(Item item);

    List<Item> getListOfItemsMatchingDesc(String desc);
}
