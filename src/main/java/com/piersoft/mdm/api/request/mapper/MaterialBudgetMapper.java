package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.MaterialBudgetDTO;
import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.persistence.entities.MaterialBudget;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaterialBudgetMapper {

    MaterialBudget sourceToDestination(MaterialBudgetDTO materialBudgetDTO);

    MaterialBudgetDTO destinationToSource(MaterialBudget materialBudget);
}
