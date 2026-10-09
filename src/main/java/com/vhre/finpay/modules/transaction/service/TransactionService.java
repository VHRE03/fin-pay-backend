package com.vhre.finpay.modules.transaction.service;

import com.vhre.base.core.base.service.BaseService;
import com.vhre.finpay.modules.transaction.dto.TransactionDTO;
import com.vhre.finpay.modules.transaction.entity.Transaction;

import java.util.UUID;

public interface TransactionService extends BaseService<Transaction, TransactionDTO, UUID> {
}
