package com.vhre.finpay.modules.transaction.repository;

import com.vhre.base.core.base.repository.BaseRepository;
import com.vhre.finpay.modules.transaction.entity.Transaction;

import java.util.UUID;

public interface TransactionRepository extends BaseRepository<Transaction, UUID> {
}
