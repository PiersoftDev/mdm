package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.MaterialBudget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialBudgetRepository extends CrudRepository<MaterialBudget,Long> {
}
