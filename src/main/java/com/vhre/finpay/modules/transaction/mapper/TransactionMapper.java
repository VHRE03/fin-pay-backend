package com.vhre.finpay.modules.transaction.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.base.core.base.mapper.BaseMapperConfig;
import com.vhre.finpay.modules.transaction.dto.TransactionDTO;
import com.vhre.finpay.modules.transaction.entity.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = BaseMapperConfig.class)
public interface TransactionMapper extends BaseMapper<Transaction, TransactionDTO> {

    /**
     * Expone los ids de las relaciones en la respuesta.
     */
    @Override
    @Mapping(target = "sourceAccountId", source = "sourceAccount.id")
    @Mapping(target = "targetAccountId", source = "targetAccount.id")
    TransactionDTO toDto(Transaction entity);

    /**
     * Las relaciones no las mapea MapStruct: las resuelve BaseServiceImpl a partir de
     * los @RelationId del DTO.
     */
    @Override
    @Mapping(target = "sourceAccount", ignore = true)
    @Mapping(target = "targetAccount", ignore = true)
    Transaction toEntity(TransactionDTO dto);

    /**
     * Como el metodo se re-declara, se repiten los ignores de los campos de auditoria
     * que el BaseMapper protege, mas los de las relaciones resueltas por @RelationId.
     */
    @Override
    @Mapping(target = "sourceAccount", ignore = true)
    @Mapping(target = "targetAccount", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    void updateEntityFromDto(TransactionDTO dto, @MappingTarget Transaction entity);
}
