package com.likang.service.impl;

import com.likang.dao.AccountDao;
import com.likang.model.Account;
import com.likang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
       List<Account> accountList = accountDao.findAll();
        System.out.println("业务层，查所有");
        return accountList;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("新增用户");
    }
}
