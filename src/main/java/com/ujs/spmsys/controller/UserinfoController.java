package com.ujs.spmsys.controller;

import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Account;
import com.ujs.spmsys.entity.Userinfo;
import com.ujs.spmsys.service.UserinfoService;
import com.ujs.spmsys.service.impl.UserinfoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Project: spmsys
 * Package: com.ujs.spmsys.controller
 * Author: vincent
 * Date: 18-4-15
 * Time: 上午10:46
 */
@RestController
public class UserinfoController {
    @Autowired
    UserinfoServiceImpl userinfoService;

    private final Logger logger = LoggerFactory.getLogger(UserinfoController.class);
    @PostMapping("/userinfo")
    @ResponseBody
    public Result createUserinfo(
            @RequestBody Userinfo reqUserinfo
            ) {
        logger.info("createUserinfo req");
        Result result = new Result();
        Integer accountid = reqUserinfo.getAccountid();
        if(userinfoService.findById(accountid)!=null) {
            logger.info("failed");
            result.setCode(ResultCode.FAIL);
            result.setMessage("userinfo already exists!");
        } else {
            userinfoService.save(reqUserinfo);
            result.setCode(ResultCode.SUCCESS);
            result.setMessage("create userinfo successfully!");
        }
        return result;
    }
    @GetMapping("/userinfo")
    @ResponseBody
    public Result getUserinfo(
            @RequestParam Integer accountid
    ) {
        logger.info("get userinfo");
        Result result = new Result();
        if(userinfoService.findById(accountid)!=null) {
            result.setCode(ResultCode.SUCCESS);
            result.setData(userinfoService.findById(accountid));
            result.setMessage("success");
        } else {
            result.setCode(ResultCode.FAIL);
            result.setMessage("error");
        }
        return result;
    }

    @PutMapping("/userinfo")
    @ResponseBody
    public Result updateUserinfo(
            @RequestBody Userinfo userinfo
    ) {
        logger.info("update userinfo");
        Result result = new Result();
        if(userinfoService.findById(userinfo.getAccountid())!=null) {
            userinfoService.update(userinfo);
            result.setCode(ResultCode.SUCCESS);
            result.setData(userinfo);
            result.setMessage("Userinfo is successfully updated");
        } else {
            result.setCode(ResultCode.NOT_FOUND);
            result.setMessage("Userinfo is not found");
        }
        return result;
    }

}
