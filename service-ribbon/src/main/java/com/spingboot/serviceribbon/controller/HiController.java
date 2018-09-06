package com.spingboot.serviceribbon.controller;

import com.spingboot.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/6下午6:18
 */
@RestController
public class HiController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "testNameRibbon") String name) {
        return helloService.hiService(name);
    }
}
