package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.Warehouse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehouseRepository extends CrudRepository<Warehouse, Long> {
    @Query("SELECT w FROM Warehouse w WHERE w.whDesc LIKE %:name%")
    List<Warehouse> searchWarehouse(String name);

    @Query("SELECT w FROM Warehouse w WHERE w.projectCode = :projectCode")
    List<Warehouse> searchWarehouseByProjectCode(String projectCode);
}
