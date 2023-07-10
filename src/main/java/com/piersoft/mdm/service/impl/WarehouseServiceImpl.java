package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.Warehouse;
import com.piersoft.mdm.persistence.repositories.WarehouseRepository;
import com.piersoft.mdm.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        return warehouseRepository.save(warehouse);
    }

    @Override
    public List<Warehouse> searchWarehouse(String name) {
        return warehouseRepository.searchWarehouse(name);
    }

    @Override
    public List<Warehouse> searchWarehouseByProjectCode(String projectCode) {
        return warehouseRepository.searchWarehouseByProjectCode(projectCode);
    }
}
