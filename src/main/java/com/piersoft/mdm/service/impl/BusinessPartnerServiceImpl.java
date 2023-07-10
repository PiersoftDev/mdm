package com.piersoft.mdm.service.impl;

import com.piersoft.mdm.persistence.entities.BusinessPartner;
import com.piersoft.mdm.persistence.repositories.BusinessPartnerRepository;
import com.piersoft.mdm.service.BusinessPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessPartnerServiceImpl implements BusinessPartnerService {

    @Autowired
    private BusinessPartnerRepository businessPartnerRepository;

    @Override
    public BusinessPartner addBusinessPartner(BusinessPartner businessPartner) {
        return businessPartnerRepository.save(businessPartner);
    }

    @Override
    public List<BusinessPartner> searchBusinessPartnerByName(String businessPartnerName) {
        return businessPartnerRepository.searchByBusinessPartnerName(businessPartnerName);
    }
}
