package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectActivityMapper {

    ProjectActivity toEntity(ProjectActivityDTO projectActivityDTO);

    ProjectActivityDTO toDTO(ProjectActivity projectActivity);
}
