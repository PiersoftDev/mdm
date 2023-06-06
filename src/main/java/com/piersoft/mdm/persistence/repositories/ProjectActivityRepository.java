package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.Project;
import com.piersoft.mdm.persistence.entities.ProjectActivity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectActivityRepository extends CrudRepository<ProjectActivity,Long> {

    @Query("SELECT e FROM ProjectActivity e WHERE projectCode = :projectCode")
    List<ProjectActivity> searchByProjectCode(@Param("projectCode") String projectCode);

    @Query("SELECT e FROM ProjectActivity e WHERE projectCode = :projectCode and activityDesc like %:activityDesc% ")
    List<ProjectActivity> searchByProjectCodeAndActivityCode(@Param("projectCode") String projectCode,@Param("activityDesc") String activityDesc);
}
