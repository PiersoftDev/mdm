package com.piersoft.mdm.api.request.mapper;

import com.piersoft.mdm.api.request.dto.CostTransactionDTO;
import com.piersoft.mdm.api.request.dto.ItemDTO;
import com.piersoft.mdm.persistence.entities.CostTransaction;
import com.piersoft.mdm.persistence.entities.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CostTransactionMapper {

    CostTransaction sourceToDestination(CostTransactionDTO costTransactionDTO);

    CostTransactionDTO destinationToSource(CostTransaction costTransaction);
}
