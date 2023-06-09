package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.MaterialBudgetDTO;
import com.piersoft.mdm.persistence.entities.MaterialBudget;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaterialBudgetMapper {

    MaterialBudget toEntity(MaterialBudgetDTO materialBudgetDTO);

    MaterialBudgetDTO toDTO(MaterialBudget materialBudget);
}
