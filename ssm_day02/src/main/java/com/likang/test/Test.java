package com.likang.test;


import com.likang.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void run(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountServiceImpl accountService = ac.getBean("accountService",AccountServiceImpl.class);
        accountService.findAll();
    }
}
