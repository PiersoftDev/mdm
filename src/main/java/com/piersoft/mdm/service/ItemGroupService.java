package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.ItemGroup;

import java.util.List;

public interface ItemGroupService {
    Long saveItemGroup(ItemGroup itemGroup);
    List<ItemGroup> searchItemGroup(String name);
}
