package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.BusinessPartner;
import com.piersoft.mdm.persistence.repositories.BusinessPartnerRepository;
import com.piersoft.mdm.service.BusinessPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessPartnerServiceImpl implements BusinessPartnerService {

    @Autowired
    private BusinessPartnerRepository businessPartnerRepository;

    @Override
    public void addBusinessPartner(BusinessPartner businessPartner) {
        businessPartnerRepository.save(businessPartner);
    }
}
