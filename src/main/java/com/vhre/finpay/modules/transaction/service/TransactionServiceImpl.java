package com.vhre.finpay.modules.transaction.service;

import com.vhre.base.core.base.service.BaseServiceImpl;
import com.vhre.finpay.modules.transaction.dto.TransactionDTO;
import com.vhre.finpay.modules.transaction.entity.Transaction;
import com.vhre.finpay.modules.transaction.mapper.TransactionMapper;
import com.vhre.finpay.modules.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TransactionServiceImpl extends BaseServiceImpl<Transaction, TransactionDTO, UUID> implements TransactionService {

    public TransactionServiceImpl(TransactionRepository repository, TransactionMapper mapper) {
        super(repository, mapper);
    }
}
