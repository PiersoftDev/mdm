package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.MaterialBudget;

public interface MaterialBudgetService {

    MaterialBudget addMaterialBudget(MaterialBudget materialBudget);

    MaterialBudget getMaterialBudget(String projectCode, String activityCode, String itemCode);
}
