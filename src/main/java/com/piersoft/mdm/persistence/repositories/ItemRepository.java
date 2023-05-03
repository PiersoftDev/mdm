package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
