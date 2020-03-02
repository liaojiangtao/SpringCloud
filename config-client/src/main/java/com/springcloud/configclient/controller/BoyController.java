package com.springcloud.configclient.controller;

import com.springcloud.configclient.config.Boy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gentel
 */

@RestController
public class BoyController {
    @Autowired
    private Boy boy;

    @GetMapping(value = "/showConfig")
    public String showConfig() {
        return "名称:" + boy.getName() + "年龄:" + boy.getAge() + "";
    }
}
