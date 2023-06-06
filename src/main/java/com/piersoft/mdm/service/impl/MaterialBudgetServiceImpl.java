package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.MaterialBudget;
import com.piersoft.mdm.persistence.repositories.MaterialBudgetRepository;
import com.piersoft.mdm.service.MaterialBudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialBudgetServiceImpl implements MaterialBudgetService {

    @Autowired
    private MaterialBudgetRepository materialBudgetRepository;

    @Override
    public void addMaterialBudget(MaterialBudget materialBudget) {
        materialBudgetRepository.save(materialBudget);
    }

    @Override
    public MaterialBudget getMaterialBudget(String projectCode, String activityCode, String itemCode) {
        return materialBudgetRepository.findByProjectCodeAndActivityCodeAndItemCode(projectCode, activityCode, itemCode);
    }
}
