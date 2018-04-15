package com.ujs.spmsys.service;

import com.ujs.spmsys.core.CommonService;
import com.ujs.spmsys.entity.Account;

public interface AccountService extends CommonService<Account> {
    Account findByName(String name);
}
