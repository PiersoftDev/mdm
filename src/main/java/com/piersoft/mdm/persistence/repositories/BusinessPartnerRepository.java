package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.BusinessPartner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessPartnerRepository extends CrudRepository<BusinessPartner, Long> {
}
