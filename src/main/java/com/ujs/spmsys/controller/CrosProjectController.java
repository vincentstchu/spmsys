package com.ujs.spmsys.controller;

import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Crosappform;
import com.ujs.spmsys.entity.Crossproject;
import com.ujs.spmsys.service.impl.ResCrosProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CrosProjectController {

    @Autowired
    ResCrosProjectServiceImpl resCrosProjectService;

    @GetMapping("/crosproj")
    @ResponseBody
    public Result getCrosproj(
            @RequestParam String authorname
    ) {
        List projects = new ArrayList<Crossproject>();
        Result result = new Result();
        if(resCrosProjectService.findAllByAuthorName(authorname)!=null)
        {
            projects=resCrosProjectService.findAllByAuthorName(authorname);
            result.setCode(ResultCode.SUCCESS);
            result.setData(projects);
            result.setMessage("Success!");
            return result;
        }
        result.setData(ResultCode.FAIL);
        return result;
    }

    @GetMapping("/crosproj/status")
    @ResponseBody
    public Result getCrosprojByStatus(
            @RequestParam Integer status
    ) {
        List projects = new ArrayList<Crossproject>();
        Result result = new Result();
        if(resCrosProjectService.findAllByStatus(status)!=null)
        {
            projects=resCrosProjectService.findAllByStatus(status);
            result.setCode(ResultCode.SUCCESS);
            result.setData(projects);
            result.setMessage("Success!");
            return result;
        }
        result.setData(ResultCode.FAIL);
        return result;
    }

    @PostMapping("/crosproj")
    @ResponseBody
    public Result createCrosproj(
            @RequestBody Crossproject crossproject
            ) {
        Result result = new Result();
        if( resCrosProjectService.findAllByName(crossproject.getName()) == null ) {
            resCrosProjectService.save(crossproject);
            result.setCode(ResultCode.SUCCESS);
            result.setData(resCrosProjectService.findAllByName(crossproject.getName()));
            result.setMessage("Create crosproj success!");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }
    @DeleteMapping("/crosproj")
    @ResponseBody
    public Result deleCrosproj(
            @RequestParam Integer crosprojid
    ) {
        Result result = new Result();
        if( resCrosProjectService.findById(crosprojid) != null) {
            resCrosProjectService.deleteById(crosprojid);
            result.setCode(ResultCode.SUCCESS);
            result.setMessage("Delete "+ Integer.toString(crosprojid));
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }
    @PostMapping("/crosappform")
    @ResponseBody
    public Result createCrosAppForm(
            @RequestBody Crosappform crosappform
            ) {
        Result result = new Result();
        if( resCrosProjectService.findByFormId(crosappform.getProjectid()) == null ){
            resCrosProjectService.saveForm(crosappform);
            Crossproject crossproject = resCrosProjectService.findById(crosappform.getProjectid());
            crossproject.setStatus(1);
            resCrosProjectService.update(crossproject);
            result.setCode(ResultCode.SUCCESS);
            result.setData(crosappform);
            result.setMessage("Create crosappform success!");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }
}
