package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.persistence.repositories.CostTransactionRepository;
import com.piersoft.mdm.service.CostTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostTransactionServiceImpl implements CostTransactionService {

    @Autowired
    private CostTransactionRepository costTransactionRepository;

    @Override
    public void addCostTransaction(CostTransaction costTransaction) {
        costTransactionRepository.save(costTransaction);
    }

    @Override
    public CostTransaction getCostTransactionByProjectCodeAndActivityCodeAndCostCode(String projectCode, String activityCode, String costCode) {
        return costTransactionRepository.getCostTransactionByProjectCodeAndActivityCodeAndCostCode(projectCode, activityCode, costCode);
    }


}
