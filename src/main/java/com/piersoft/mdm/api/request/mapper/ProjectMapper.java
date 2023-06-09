package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.ProjectDTO;
import com.piersoft.mdm.persistence.entities.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    Project toEntity(ProjectDTO projectDTO);

    ProjectDTO toDTO(Project project);
}
