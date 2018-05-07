package com.ujs.spmsys.controller;

import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Account;
import com.ujs.spmsys.service.impl.AccountServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Project: spmsys
 * Package: com.ujs.spmsys.controller
 * Author: vincent
 * Date: 18-4-15
 * Time: 上午10:16
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountServiceImpl accountService;
    private final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @PostMapping("/signin")
    @ResponseBody
    public Result rLogin(
            @RequestBody Account reqAccount
    ) {
        logger.info(reqAccount.getAccountname());
        logger.info(reqAccount.getPasswd());
        String name = reqAccount.getAccountname();
        String passwd = reqAccount.getPasswd();
        Result result = new Result();
        if(accountService.findByName(name)!=null)
            if(accountService.findByName(name).getPasswd().equals(passwd)) {
                Account account = accountService.findByName(name);
                result.setCode(ResultCode.SUCCESS);
                result.setData(account);
                result.setMessage("login successful!");
                return result;
            }
        result.setCode(ResultCode.FAIL);
        result.setMessage("Failed!");
        return result;
    }

    @RequestMapping("/signup")
    @ResponseBody
    public Result rRegister(
            @RequestBody Account regAccount
    ) {
        logger.info("attempt to create acount"+ regAccount.getAccountname());
        String name = regAccount.getAccountname();
        String passwd = regAccount.getPasswd();
        Result result = new Result();
        if(accountService.findByName(name)!=null) {
            logger.info("failed");
            result.setCode(ResultCode.FAIL);
            result.setMessage("account name already exists!");
            return result;
        } else {
            accountService.save(regAccount);
            result.setCode(ResultCode.SUCCESS);
            result.setData(regAccount);
            result.setMessage("Sign in successfully!");
            return result;
        }
//        result.setCode(ResultCode.FAIL);
//        result.setMessage("error!");
//        return result;
    }

    @GetMapping("/getid")
    @ResponseBody
    public Result getId(
            @RequestParam("name") String name
    ) {
        logger.info("attemp to get the id of " + name);
        Result result = new Result();
        if(accountService.findByName(name)!=null) {
            result.setCode(ResultCode.SUCCESS);
            Account account = new Account();
            account.setId(accountService.findByName(name).getId());
            result.setData(account);
            result.setMessage("success");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }
}
