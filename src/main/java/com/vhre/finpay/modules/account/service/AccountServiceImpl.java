package com.vhre.finpay.modules.account.service;

import com.vhre.base.core.base.service.BaseServiceImpl;
import com.vhre.finpay.modules.account.dto.AccountDTO;
import com.vhre.finpay.modules.account.entity.Account;
import com.vhre.finpay.modules.account.mapper.AccountMapper;
import com.vhre.finpay.modules.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account, AccountDTO, UUID> implements AccountService {

    public AccountServiceImpl(AccountRepository repository, AccountMapper mapper) {
        super(repository, mapper);
    }
}
