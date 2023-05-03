package com.piersoft.mdm.controller;

import com.piersoft.mdm.api.request.dto.ProjectActivityDTO;
import com.piersoft.mdm.api.request.dto.ProjectDTO;
import com.piersoft.mdm.api.request.mapper.ProjectActivityMapper;
import com.piersoft.mdm.api.request.mapper.ProjectMapper;
import com.piersoft.mdm.persistence.entities.Project;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import com.piersoft.mdm.service.ProjectActivityService;
import com.piersoft.mdm.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/masters/project-activities")
public class ProjectActivityController {

    private final Logger logger = LoggerFactory.getLogger(ProjectActivityController.class);
    @Autowired
    private ProjectActivityService projectActivityService;

    @Autowired
    private ProjectActivityMapper projectActivityMapper;

    @ApiOperation(value = "Adds a project activity", notes = "Returns a project activity id", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created a project activity"),
            @ApiResponse(code = 404, message = "Not found - The project activity not found")
    })
    @PostMapping("/addProjectActivity")
    public void addProject(@RequestBody ProjectActivityDTO projectActivityDTO){
        logger.debug("Adding project activity with lnId:%s",projectActivityDTO.getLnId());
        ProjectActivity projectActivity = projectActivityMapper.sourceToDestination(projectActivityDTO);
        projectActivityService.addProjectActivity(projectActivity);
        logger.debug("Successfully added project activity with lnId:%s",projectActivityDTO.getLnId());
    }


    @ApiOperation(value = "search for  a project activity", notes = "Returns a list of project activity entities", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found a project activity"),
            @ApiResponse(code = 404, message = "Not found - The project activity not found")
    })
    @PostMapping("/searchProjectActivity")
    public void searchProjectActivity(@PathVariable String projectId, @PathVariable String activityString){
//        logger.debug("Searching project activity with projectLnId: %s and activityString: %s",projectId, activityString);
//        projectActivityService.addProjectActivity(projectActivity);
//        logger.debug("Successfully added project activity with lnId:%s",projectActivityDTO.getLnId());
    }
}
