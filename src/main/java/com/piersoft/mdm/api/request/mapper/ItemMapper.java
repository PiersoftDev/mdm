package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.ItemDTO;
import com.piersoft.mdm.persistence.entities.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item toEntity(ItemDTO itemDTO);

    ItemDTO toDTO(Item item);
}
