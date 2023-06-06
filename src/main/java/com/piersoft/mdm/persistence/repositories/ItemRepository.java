package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.Item;
import com.piersoft.mdm.persistence.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query("SELECT e FROM Item e WHERE itemDesc LIKE %:itemDesc%")
    List<Item> searchByItemDesc(@Param("itemDesc") String itemDesc);
}
