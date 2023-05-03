package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.CostTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostTransactionRepository extends CrudRepository<CostTransaction, Long> {
}
