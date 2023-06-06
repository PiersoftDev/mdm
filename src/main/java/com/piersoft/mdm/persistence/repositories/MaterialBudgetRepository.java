package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.MaterialBudget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialBudgetRepository extends CrudRepository<MaterialBudget,Long> {
    @Query("SELECT e FROM MaterialBudget e WHERE projectCode = :projectCode and activityCode = :activityCode and itemCode = :itemCode")
    MaterialBudget findByProjectCodeAndActivityCodeAndItemCode(String projectCode, String activityCode, String itemCode);
}
