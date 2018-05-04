package com.ujs.spmsys.controller;

import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Crosappform;
import com.ujs.spmsys.entity.Crossappfile;
import com.ujs.spmsys.entity.Crossproject;
import com.ujs.spmsys.service.impl.ResCrosProjectServiceImpl;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class CrosProjectController {

    @Autowired
    ResCrosProjectServiceImpl resCrosProjectService;
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

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

    @GetMapping("/crosproj/all")
    @ResponseBody
    public Result getCrosprojByStatus() {
        List projects = new ArrayList<Crossproject>();
        Result result = new Result();
        projects=resCrosProjectService.findAll();
        result.setCode(ResultCode.SUCCESS);
        result.setData(projects);
        result.setMessage("Success!");
        return result;
    }

    @GetMapping("/crosproj/type/{type}")
    @ResponseBody
    public Result getCrosprojByStatus(
            @PathVariable("type") String type
    ) {
        List projects = new ArrayList<Crossproject>();
//        List projects2 = new ArrayList<Crossproject>();
        Result result = new Result();
        Integer t = Integer.parseInt(type);
        if(t == 2)
            projects=resCrosProjectService.findAll();
        else if(t == 0 || t == 1)
            projects=resCrosProjectService.findAllByType(t);
        result.setCode(ResultCode.SUCCESS);
        result.setData(projects);
        result.setMessage("Success!");
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

    //改变项目的状态
    @PutMapping("/crosproj/{id}/status/{status}")
    @ResponseBody
    public Result changeProjStatus(
            @PathVariable("id") String id,
            @PathVariable("status") String status
    ) {
        logger.info("finish proj" + id );
        Integer projid = Integer.parseInt(id);
        Integer projstatus = Integer.parseInt(status);
        Result result = new Result();
        if( resCrosProjectService.findById(projid) != null) {
            Crossproject crossproject = resCrosProjectService.findById(projid);
            crossproject.setStatus(projstatus);
            resCrosProjectService.update(crossproject);
            result.setCode(ResultCode.SUCCESS);
            result.setData(crossproject);
            result.setMessage("change status success");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }

    @DeleteMapping("/crosproj/{id}")
    @ResponseBody
    public Result deleCrosproj(
//            @RequestParam Integer crosprojid
            @PathVariable("id") String id
    ) {
        logger.info("delete project " + id);
        Integer crosprojid = Integer.parseInt(id);
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
        logger.info("申请表保存失败");
        result.setCode(ResultCode.FAIL);
        return result;
    }

    @PutMapping("/crossproj/submit/{id}")
    @ResponseBody
    public Result submmitCrosProj(
            @PathVariable("id") String id
    ) {
        Integer projid = Integer.parseInt(id);
        logger.info("送审项目");
        Result result = new Result();
        Crossproject crossproject = resCrosProjectService.findById(projid);
        if(crossproject != null) {
            crossproject.setStatus(3);
            resCrosProjectService.update(crossproject);
            result.setCode(ResultCode.SUCCESS);
            result.setData(crossproject);
            result.setMessage("submit success");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return  result;
    }


    @GetMapping("/crossproj/details/{id}")
    @ResponseBody
    public Result getCrosProjDetails(
            @PathVariable("id") String id
    ) {
        Integer projid = Integer.parseInt(id);
        logger.info("尝试获取项目id" + id);
        Result result = new Result();
        if(resCrosProjectService.findByFormId(projid) != null ) {
            result.setCode(ResultCode.SUCCESS);
            result.setData(resCrosProjectService.findByFormId(projid));
            result.setMessage("find details success");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }

    @PostMapping("/crossappfile")
    @ResponseBody
    public Result upload(@RequestParam("crossappfile") MultipartFile file,
    @RequestParam("projid") Integer projid) {
        Result result = new Result();
        if (file.isEmpty()) {
            result.setCode(ResultCode.FAIL);
            return result;
        }

        // 获取文件名
        String fileName = file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);

        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);

        // 文件上传路径
        String filePath = "/home/vincent/spmsysfiles/";

        // 解决中文问题，liunx下中文路径，图片显示问题
        fileName = UUID.randomUUID() + suffixName;

        File dest = new File(filePath + fileName);

        Crossappfile crossappfile = new Crossappfile();
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        try {
            file.transferTo(dest);
            crossappfile.setId(projid);
            crossappfile.setFilename(fileName);
            crossappfile.setFilepath(filePath + fileName);
            resCrosProjectService.saveFile(crossappfile);
            result.setCode(ResultCode.SUCCESS);
            result.setData(crossappfile);
            return result;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }

    @GetMapping("/crossappfile/{id}")
//    @ResponseBody
    public ResponseEntity<FileSystemResource> crossAppFileDown(
            @PathVariable("id") String fileid
    ) {
        Integer id = Integer.parseInt(fileid);
        Crossappfile crossappfile = resCrosProjectService.findByFileId(id);
        String filepath = crossappfile.getFilepath();
        File file = new File(filepath);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + crossappfile.getFilename());
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new FileSystemResource(file));
    }

}
