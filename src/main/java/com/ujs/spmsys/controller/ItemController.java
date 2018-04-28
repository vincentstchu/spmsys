package com.ujs.spmsys.controller;

import com.ujs.spmsys.core.Result;
import com.ujs.spmsys.core.ResultCode;
import com.ujs.spmsys.entity.Crossappfile;
import com.ujs.spmsys.entity.Item;
import com.ujs.spmsys.service.ItemService;
import com.ujs.spmsys.service.impl.ItemServiceImpl;
import org.apache.logging.log4j.message.ReusableMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class ItemController {
    @Autowired
    ItemServiceImpl itemService;

    private final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @PostMapping("/item")
    @ResponseBody
    public Result createItem(
        @RequestParam("itemfile") MultipartFile file,
        @RequestParam("type") Integer type,
        @RequestParam("name") String name,
        @RequestParam("accountid") Integer accountid
    ) {
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
        String filePath = "d:/roncoo/education/";

        // 解决中文问题，liunx下中文路径，图片显示问题
        fileName = UUID.randomUUID() + suffixName;

        File dest = new File(filePath + fileName);

        Item item = new Item();
        // 检测是否存在目录
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }

        try {
            file.transferTo(dest);
            item.setName(name);
            item.setType(type);
            item.setAccountid(accountid);
            item.setFilepath(filePath + fileName);
            itemService.save(item);
            result.setCode(ResultCode.SUCCESS);
            result.setData(item);
            return result;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.setCode(ResultCode.FAIL);
        return result;
    }

    @GetMapping("/item/{id}")
    @ResponseBody
    public Result getItemById(
            @PathVariable("id") String id
    ) {
        Result result = new Result();
        if(itemService.findByAccountid(Integer.parseInt(id)) != null) {
            result.setCode(ResultCode.SUCCESS);
            result.setData(itemService.findByAccountid(Integer.parseInt(id)));
            result.setMessage("Success");
            return result;
        }
        result.setCode(ResultCode.FAIL);
        result.setMessage("Fail");
        return result;
    }
    @GetMapping("/item/file/{id}")
    public ResponseEntity<FileSystemResource> getItemFile(
            @PathVariable("id") String id
    ) {
        Integer itemId = Integer.parseInt(id);
        Item item = itemService.findById(itemId);
        String filepath = item.getFilepath();
        logger.info("获取" + item.getFilepath());
        File file = new File(filepath);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Content-Disposition", "attachment; filename=" + item.getFilepath());
//                item.getName() +
//                item.getFilepath().substring(item.getFilepath().lastIndexOf(".")));
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        return ResponseEntity
                .ok()
                .headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(new FileSystemResource(file));
    }

    @GetMapping("/items")
    @ResponseBody
    public Result getItems() {
        Result result = new Result();
        result.setData(itemService.findAll());
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("success");
        return result;
    }
}
