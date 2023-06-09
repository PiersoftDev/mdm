package com.piersoft.mdm.api.request.mapper;


import com.piersoft.mdm.api.request.dto.BusinessPartnerDTO;
import com.piersoft.mdm.persistence.entities.BusinessPartner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BusinessPartnerMapper {

    BusinessPartner toDTO(BusinessPartnerDTO businessPartnerDTO);

    BusinessPartnerDTO toEntity(BusinessPartner businessPartner);
}
