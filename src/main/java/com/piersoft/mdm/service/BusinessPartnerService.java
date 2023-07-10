package com.piersoft.mdm.service;

import com.piersoft.mdm.persistence.entities.BusinessPartner;

import java.util.List;

public interface BusinessPartnerService {

    BusinessPartner addBusinessPartner(BusinessPartner businessPartner);

    List<BusinessPartner> searchBusinessPartnerByName(String businessPartnerName);
}
