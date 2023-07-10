package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.ProjectActivity;

import java.util.List;

public interface ProjectActivityService {

    ProjectActivity addProjectActivity(ProjectActivity projectActivity);

    List<ProjectActivity> getAllActivitiesForProjectCode(String projectCode);

    List<ProjectActivity> searchActivitiesByProjectCode(String projectCode, String activityDesc);
}
