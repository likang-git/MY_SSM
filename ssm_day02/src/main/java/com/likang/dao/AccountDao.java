package com.likang.dao;

import com.likang.model.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户接口
 */
@Repository
public interface AccountDao {

    //查询所有账户信息
    @Select("select * from lk_account")
    List<Account> findAll();

    //保存账户信息
    @Insert("insert into lk_account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
