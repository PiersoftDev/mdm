package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectActivityRepository extends CrudRepository<ProjectActivity,Long> {

}
