package com.vhre.finpay.modules.customer.mapper;

import com.vhre.base.core.base.mapper.BaseMapper;
import com.vhre.base.core.base.mapper.BaseMapperConfig;
import com.vhre.finpay.modules.customer.dto.CustomerDTO;
import com.vhre.finpay.modules.customer.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface CustomerMapper extends BaseMapper<Customer, CustomerDTO> {
}
