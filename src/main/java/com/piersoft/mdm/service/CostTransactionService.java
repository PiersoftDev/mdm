package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.CostTransaction;

public interface CostTransactionService {

    void addCostTransaction(CostTransaction costTransaction);

    CostTransaction getCostTransactionByProjectCodeAndActivityCodeAndCostCode(String projectCode, String activityCode, String costCode);
}
