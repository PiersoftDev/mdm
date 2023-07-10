package com.piersoft.mdm.controller;


import com.piersoft.mdm.api.request.dto.ProjectDTO;
import com.piersoft.mdm.api.request.mapper.ProjectMapper;
import com.piersoft.mdm.api.response.dto.GenericResponseDTO;
import com.piersoft.mdm.persistence.entities.Project;
import com.piersoft.mdm.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/masters/projects")
public class ProjectController {

    private final Logger logger = LoggerFactory.getLogger(ProjectController.class);
    @Autowired
    private ProjectService projectService;

    @Autowired
    private ProjectMapper projectMapper;

    @ApiOperation(value = "Adds a project", notes = "Returns a project id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a project"),
            @ApiResponse(code = 404, message = "Not found - The project not found")
    })
    @PostMapping("/addProject")
    public ResponseEntity<GenericResponseDTO> addProject(@RequestBody ProjectDTO projectDTO){
        logger.debug("Adding project with lnId::{}",projectDTO.getLnId());
        Project project = projectMapper.toEntity(projectDTO);
        project = projectService.addProject(project);
        logger.debug("Successfully added project with lnId::{}",projectDTO.getLnId());
        return ResponseEntity.ok(GenericResponseDTO.builder().statusCode(HttpStatus.OK).messageCode("Successfully added project").data(project).success(true).build());
    }

    @ApiOperation(value = "Search for a projectName", notes = "Returns a list of projects that contain given string", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully returns a list of projects that contains the search string"),
            @ApiResponse(code = 404, message = "Not found - no projects found")
    })
    @GetMapping("/searchProject/{projectName}")
    public ResponseEntity<GenericResponseDTO> searchProject(@PathVariable String  projectName){
        logger.debug("Searching for a project by name that contains : {}", projectName);
        List<Project> projectList = projectService.searchProjectByName(projectName);
        logger.debug("Done searching for a project by name that contains : {}", projectName);
        return ResponseEntity.ok(GenericResponseDTO.builder().statusCode(HttpStatus.OK).messageCode("Successfully returns a list of projects that contains the search string").success(true).data(projectList).build());
    }

    @ApiOperation(value = "Find all projects", notes = "Returns a list of projects", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully a list of projects"),
            @ApiResponse(code = 404, message = "Not found - no projects found")
    })
    @GetMapping("/listProjects")
    public ResponseEntity<GenericResponseDTO> getAllProjects(){
        logger.debug("Finding all projects");
        List<Project> projectList = projectService.getAllProjects();
        logger.debug("Done finding all projects");
        return ResponseEntity.ok(GenericResponseDTO.builder().statusCode(HttpStatus.OK).messageCode("Successfully returns a list of projects").success(true).data(projectList).build());
    }

}
