package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.service.CostTransactionService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostTransactionRepository extends CrudRepository<CostTransaction, Long> {
    @Query("SELECT e FROM CostTransaction e WHERE projectCode = :projectCode and activity = :activityCode and costObject = :costCode")
    List<CostTransaction> getCostTransactionByProjectCodeAndActivityCodeAndCostCode(String projectCode, String activityCode, String costCode);
}
