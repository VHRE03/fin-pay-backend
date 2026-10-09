package com.vhre.finpay.modules.account.controller;

import com.vhre.base.core.base.controller.BaseController;
import com.vhre.finpay.modules.account.dto.AccountDTO;
import com.vhre.finpay.modules.account.entity.Account;
import com.vhre.finpay.modules.account.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController extends BaseController<Account, AccountDTO, UUID> {

    public AccountController(AccountService service) {
        super(service);
    }
}
