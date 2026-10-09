package com.vhre.finpay.modules.transaction.controller;

import com.vhre.base.core.base.controller.BaseController;
import com.vhre.finpay.modules.transaction.dto.TransactionDTO;
import com.vhre.finpay.modules.transaction.entity.Transaction;
import com.vhre.finpay.modules.transaction.service.TransactionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController extends BaseController<Transaction, TransactionDTO, UUID> {

    public TransactionController(TransactionService service) {
        super(service);
    }
}
