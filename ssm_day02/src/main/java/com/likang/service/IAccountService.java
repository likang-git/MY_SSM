package com.likang.service;

import com.likang.model.Account;



import java.util.List;

public interface IAccountService {
    //查询所有账户信息
    List<Account> findAll();

    //保存账户信息
    void saveAccount(Account account);
}
