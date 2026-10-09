package com.vhre.finpay.modules.account.service;

import com.vhre.base.core.base.service.BaseService;
import com.vhre.finpay.modules.account.dto.AccountDTO;
import com.vhre.finpay.modules.account.entity.Account;

import java.util.UUID;

public interface AccountService extends BaseService<Account, AccountDTO, UUID> {
}
