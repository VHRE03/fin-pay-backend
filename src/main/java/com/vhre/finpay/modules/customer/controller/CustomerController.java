package com.vhre.finpay.modules.customer.controller;

import com.vhre.base.core.base.controller.BaseController;
import com.vhre.finpay.modules.customer.dto.CustomerDTO;
import com.vhre.finpay.modules.customer.entity.Customer;
import com.vhre.finpay.modules.customer.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController extends BaseController<Customer, CustomerDTO, UUID> {

    public CustomerController(CustomerService service) {
        super(service);
    }
}
