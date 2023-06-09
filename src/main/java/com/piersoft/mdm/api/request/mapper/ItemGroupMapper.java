package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.ItemGroupDTO;
import com.piersoft.mdm.persistence.entities.ItemGroup;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemGroupMapper {

    ItemGroupDTO toDTO(ItemGroup itemGroup);
    ItemGroup toEntity(ItemGroupDTO itemGroupDTO);
}
