package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.Project;
import com.piersoft.mdm.persistence.repositories.ProjectRepository;
import com.piersoft.mdm.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void addProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    @Transactional
    public void deleteProject(String projectId) {
        projectRepository.deleteByLnId(projectId);
    }

    @Override
    public void updateProject(Project project) {
    }

    @Override
    public List<Project> searchProjectByName(String projectName) {
        return projectRepository.searchByProjectName(projectName);
    }
}
