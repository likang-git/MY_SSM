package com.likang.test;

import com.likang.dao.AccountDao;
import com.likang.model.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void  run() throws IOException {
        //获取数据源
        InputStream sc = Resources.getResourceAsStream("SqlMyConfig.xml");
        //创建
        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(sc);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao =    sqlSession.getMapper(AccountDao.class);
        List<Account> accountList = accountDao.findAll();
        for (Account account : accountList){
            System.out.println(account);
        }
//        Account account = new Account();
//        account.setMoney(125.25);
//        account.setName("李康");
//        accountDao.saveAccount(account);
//        sqlSession.commit();
        sc.close();
        sqlSession.close();
    }
}
