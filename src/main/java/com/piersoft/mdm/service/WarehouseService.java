package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.Warehouse;

import java.util.List;

public interface WarehouseService {

    Warehouse createWarehouse(Warehouse warehouse);

    List<Warehouse> searchWarehouse(String name);

    List<Warehouse> searchWarehouseByProjectCode(String projectCode);
}
