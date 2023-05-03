package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectActivityMapper {

    ProjectActivity sourceToDestination(ProjectActivityDTO projectActivityDTO);

    ProjectActivityDTO destinationToSource(ProjectActivity projectActivity);
}
