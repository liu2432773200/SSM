package com.liu.controller;

import com.liu.service.FileUploadRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ViewController {
    @Autowired
    private FileUploadRecordService fileUploadRecordService;

    @RequestMapping({"","index"})
    public String doGetControllerOne() {
        return "Hello world";
    }

    @RequestMapping("list")
    public List list() {
        return fileUploadRecordService.list();
    }

}
