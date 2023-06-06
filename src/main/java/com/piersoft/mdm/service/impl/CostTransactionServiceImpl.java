package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.persistence.repositories.CostTransactionRepository;
import com.piersoft.mdm.service.CostTransactionService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostTransactionServiceImpl implements CostTransactionService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CostTransactionServiceImpl.class);

    @Autowired
    private CostTransactionRepository costTransactionRepository;

    @Override
    public void addCostTransaction(CostTransaction costTransaction) {
        costTransactionRepository.save(costTransaction);
    }

    @Override
    public CostTransaction getCostTransactionByProjectCodeAndActivityCodeAndCostCode(String projectCode, String activityCode, String costCode) {
       List<CostTransaction> costTransactions = costTransactionRepository.getCostTransactionByProjectCodeAndActivityCodeAndCostCode(projectCode, activityCode, costCode);
       if(costTransactions.size() == 0){
           log.debug("NO COST TRANSACTION FOUND FOR PROJECT CODE: " + projectCode + " ACTIVITY CODE: " + activityCode + " COST CODE: " + costCode);
           return null;
       }
        return costTransactionRepository.getCostTransactionByProjectCodeAndActivityCodeAndCostCode(projectCode, activityCode, costCode).get(0);
    }


}
