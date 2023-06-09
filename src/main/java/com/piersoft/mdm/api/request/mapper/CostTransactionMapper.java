package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.CostTransactionDTO;
import com.piersoft.mdm.persistence.entities.CostTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CostTransactionMapper {

    CostTransaction toEntity(CostTransactionDTO costTransactionDTO);

    CostTransactionDTO toDTO(CostTransaction costTransaction);
}
