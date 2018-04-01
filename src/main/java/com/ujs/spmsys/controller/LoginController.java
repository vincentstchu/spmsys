package com.ujs.spmsys.controller;

/**
 * Project: spmsys
 * Package: com.ujs.spmsys.controller
 * Created by vince on 2018/4/1 13:37
 */
import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Reseacher;
import com.ujs.spmsys.service.impl.ReseacherServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//注意Controller类型
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    ReseacherServiceImpl reseacherService;
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/hello")
    public Result hello(){
        Result result = new Result();
        result.setCode(ResultCode.FAIL);
        result.setMessage("Failed!");
        return result;
    }
    @RequestMapping("/researchers")
    public Result rLogin(
            @RequestParam(name="rename") String name,
            @RequestParam(name="repasswd") String passwd
    ) throws NullPointerException{
        logger.info(name);
        logger.info(passwd);
        Result result = new Result();
        if(reseacherService.findByName(name)!=null)
            if(reseacherService.findByName(name).getPasswd().equals(passwd)) {
                Reseacher reseacher = reseacherService.findByName(name);
                result.setCode(ResultCode.SUCCESS);
                result.setData(reseacher);
                result.setMessage("login successful!");
                return result;
            }
        result.setCode(ResultCode.FAIL);
        result.setMessage("Failed!");
        return result;
    }

}

