package com.ujs.spmsys.controller;

/**
 * Project: spmsys
 * Package: com.ujs.spmsys.controller
 * Created by vince on 2018/4/1 13:37
 */
import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Researcher;
import com.ujs.spmsys.service.impl.ResearcherServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//注意Controller类型
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    ResearcherServiceImpl researcherService;
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/researchers")
    @ResponseBody
    public Result rLogin(
            @RequestBody Researcher reqResearcher
    ) throws NullPointerException{
        logger.info(reqResearcher.getName());
        logger.info(reqResearcher.getPasswd());
        String name = reqResearcher.getName();
        String passwd = reqResearcher.getPasswd();
        Result result = new Result();
        if(researcherService.findByName(name)!=null)
            if(researcherService.findByName(name).getPasswd().equals(passwd)) {
                Researcher reseacher = researcherService.findByName(name);
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

