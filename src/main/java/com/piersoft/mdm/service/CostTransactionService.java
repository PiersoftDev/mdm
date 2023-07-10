package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.CostTransaction;

public interface CostTransactionService {

    CostTransaction addCostTransaction(CostTransaction costTransaction);

    CostTransaction getCostTransactionByProjectCodeAndActivityCodeAndCostCode(String projectCode, String activityCode, String costCode);
}
