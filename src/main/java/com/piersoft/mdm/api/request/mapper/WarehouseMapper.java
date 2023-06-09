package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.WarehouseDTO;
import com.piersoft.mdm.persistence.entities.Warehouse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {

    Warehouse toEntity(WarehouseDTO warehouseDTO);

    WarehouseDTO toDTO(Warehouse warehouse);
}
