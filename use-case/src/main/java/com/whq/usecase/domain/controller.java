package com.whq.usecase.domain;

import com.fc.async.annotation.AsyncExec;
import com.fc.async.enums.AsyncTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
//    @GetMapping("/")
//    public String home(Model model) {
//        model.addAttribute("message", "Hello, Thymeleaf!");
//        return "index";
//    }

    @Autowired
    service service;

    @GetMapping("/getRtInfo")
    public String getRtInfo() {
        service.test();
        System.out.println("222222222222");
        return "test";
    }



    @GetMapping("/getRtInfo1")
    public String getRtInfo1() {
        service.test1();
        return "test";
    }


}
