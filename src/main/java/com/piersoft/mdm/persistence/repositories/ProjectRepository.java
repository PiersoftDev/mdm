package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProjectRepository extends CrudRepository<Project, String> {

      void deleteByLnId(String lnId);

      @Query("SELECT e FROM Project e WHERE projectName LIKE %:projectName%")
      List<Project> searchByProjectName(@Param("projectName") String projectName);


}
