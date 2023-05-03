package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.ProjectActivity;

import java.util.List;

public interface ProjectActivityService {

    void addProjectActivity(ProjectActivity projectActivity);

    List<ProjectActivity> searchProjectActivity(String projectId, String activityString);
}
