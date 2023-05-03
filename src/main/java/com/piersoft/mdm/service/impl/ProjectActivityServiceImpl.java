package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.ProjectActivity;
import com.piersoft.mdm.persistence.repositories.ProjectActivityRepository;
import com.piersoft.mdm.service.ProjectActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectActivityServiceImpl implements ProjectActivityService {

    @Autowired
    private ProjectActivityRepository projectActivityRepository;

    @Override
    public void addProjectActivity(ProjectActivity projectActivity) {
        projectActivityRepository.save(projectActivity);
    }

    @Override
    public List<ProjectActivity> searchProjectActivity(String projectId, String activityString) {
        return null;
    }
}
