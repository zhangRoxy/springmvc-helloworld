package com.zrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/account")
public class AccountController {

    /**
     * 查询账户
     * @param accountId
     * @return
     */
    @RequestMapping("/findAccount")
    public String findAccount(Integer accountId) {
        System.out.println("查询了账户。。。。"+accountId);
        return "success";
    }

}
