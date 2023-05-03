package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.BusinessPartnerDTO;
import com.piersoft.mdm.api.request.dto.CostTransactionDTO;
import com.piersoft.mdm.persistence.entities.BusinessPartner;
import com.piersoft.mdm.persistence.entities.CostTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BusinessPartnerMapper {

    BusinessPartner sourceToDestination(BusinessPartnerDTO businessPartnerDTO);

    BusinessPartnerDTO destinationToSource(BusinessPartner businessPartner);
}
