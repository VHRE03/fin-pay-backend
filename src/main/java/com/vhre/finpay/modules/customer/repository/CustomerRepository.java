package com.vhre.finpay.modules.customer.repository;

import com.vhre.base.core.base.repository.BaseRepository;
import com.vhre.finpay.modules.customer.entity.Customer;

import java.util.UUID;

public interface CustomerRepository extends BaseRepository<Customer, UUID> {
}
