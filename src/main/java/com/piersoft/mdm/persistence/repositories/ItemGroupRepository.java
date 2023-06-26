package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.ItemGroup;
import com.piersoft.mdm.service.ItemGroupService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemGroupRepository extends CrudRepository<ItemGroup, Long> {
    @Query("SELECT e FROM ItemGroup e WHERE itemGroupDesc LIKE %:itemGroupName%")
    List<ItemGroup> searchByItemGroupName(String itemGroupName);

}
