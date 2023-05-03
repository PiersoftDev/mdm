package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.ItemDTO;
import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.persistence.entities.Item;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {

    Item sourceToDestination(ItemDTO itemDTO);

    ItemDTO destinationToSource(Item item);
}
