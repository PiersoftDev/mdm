package com.piersoft.mdm.controller;


import com.piersoft.mdm.api.request.dto.ProjectDTO;
import com.piersoft.mdm.api.request.mapper.ProjectMapper;
import com.piersoft.mdm.persistence.entities.Project;
import com.piersoft.mdm.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void addProject(@RequestBody ProjectDTO projectDTO){
        logger.debug("Adding project with lnId: "+projectDTO.getLnId());
        Project project = projectMapper.sourceToDestination(projectDTO);
        projectService.addProject(project);
        logger.debug("Successfully added project with lnId: "+projectDTO.getLnId());
    }

    @ApiOperation(value = "Search for a projectName", notes = "Returns a list of projects that matches projectName", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully returns a list of projects that matches projectName"),
            @ApiResponse(code = 404, message = "Not found - no projects found")
    })
    @GetMapping("/searchProject/{projectName}")
    public ResponseEntity<List<Project>> searchProject(@PathVariable String  projectName){
        logger.debug("Searching for a projectName that contains : "+projectName);
        List<Project> projectList = projectService.searchProjectByName(projectName);
        logger.debug("Done searching for a projectName that contains : "+projectName);
        return ResponseEntity.ok(projectList);
    }

    @ApiOperation(value = "Find all projects", notes = "Returns a list of projects", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully a list of projects"),
            @ApiResponse(code = 404, message = "Not found - no projects found")
    })
    @GetMapping("/searchProject/")
    public ResponseEntity<List<Project>> getAllProjects(){
        logger.debug("Finding all projects");
        List<Project> projectList = projectService.getAllProjects();
        logger.debug("Done finding all projects");
        return ResponseEntity.ok(projectList);
    }

}
