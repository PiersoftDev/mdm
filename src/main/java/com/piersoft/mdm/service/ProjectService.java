package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.Project;

import java.util.List;

public interface ProjectService {

    public void addProject(Project project);

    public void deleteProject(String projectId);

    void updateProject(Project project);

    List<Project> searchProjectByName(String projectName);
}
