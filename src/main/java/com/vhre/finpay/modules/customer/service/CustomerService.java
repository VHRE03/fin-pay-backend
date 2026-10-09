package com.vhre.finpay.modules.customer.service;

import com.vhre.base.core.base.service.BaseService;
import com.vhre.finpay.modules.customer.dto.CustomerDTO;
import com.vhre.finpay.modules.customer.entity.Customer;

import java.util.UUID;

public interface CustomerService extends BaseService<Customer, CustomerDTO, UUID> {
}
