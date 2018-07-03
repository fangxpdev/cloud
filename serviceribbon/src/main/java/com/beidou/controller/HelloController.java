package com.beidou.controller;

import com.beidou.service.HelloService;
import com.beidou.service.HystrixHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author beidou
 * @since 18/7/2
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    private HystrixHelloService hystrixHelloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hystrixHi")
    public String hystrixHi(@RequestParam String name) {
        return hystrixHelloService.hiService(name);
    }
}
