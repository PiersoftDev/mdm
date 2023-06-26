package com.piersoft.mdm.persistence.repositories;

import com.piersoft.mdm.persistence.entities.BusinessPartner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessPartnerRepository extends CrudRepository<BusinessPartner, Long> {

    @Query("select e  from BusinessPartner e  WHERE bpDesc like %:businessPartnerName%")
    List<BusinessPartner> searchByBusinessPartnerName(String businessPartnerName);
}
