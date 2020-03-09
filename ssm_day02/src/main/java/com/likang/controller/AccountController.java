package com.likang.controller;

import com.likang.model.Account;
import com.likang.service.IAccountService;
import com.likang.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 查询账号
     * @return
     */
    @RequestMapping("/findAll")
    @ResponseBody
    public ModelAndView findAll() {
        System.out.println("业务层");
        ModelAndView mv = new ModelAndView();
        List<Account> accountList = accountService.findAll();
        mv.addObject("accountList",accountList);
        mv.setViewName("list");
        return mv;
    }

    /**
     * 新增账号
     */
    @RequestMapping("/save")
    public void  addAccount(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
