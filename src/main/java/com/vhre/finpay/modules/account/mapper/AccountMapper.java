package com.vhre.finpay.modules.account.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.base.core.base.mapper.BaseMapperConfig;
import com.vhre.finpay.modules.account.dto.AccountDTO;
import com.vhre.finpay.modules.account.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = BaseMapperConfig.class)
public interface AccountMapper extends BaseMapper<Account, AccountDTO> {

    /**
     * Expone el id de la relacion en la respuesta: entity.customer.id -> dto.customerId.
     */
    @Override
    @Mapping(target = "customerId", source = "customer.id")
    AccountDTO toDto(Account entity);

    /**
     * La relacion no la mapea MapStruct: la resuelve BaseServiceImpl a partir del
     * @RelationId del DTO.
     */
    @Override
    @Mapping(target = "customer", ignore = true)
    Account toEntity(AccountDTO dto);

    /**
     * Como el metodo se re-declara, se repiten los ignores de los campos de auditoria
     * que el BaseMapper protege, mas el de la relacion resuelta por @RelationId.
     */
    @Override
    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    void updateEntityFromDto(AccountDTO dto, @MappingTarget Account entity);
}
