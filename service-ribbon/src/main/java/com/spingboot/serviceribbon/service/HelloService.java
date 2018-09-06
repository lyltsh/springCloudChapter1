package com.spingboot.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/6下午6:16
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过使用ServiceName，来做负载均衡
     *
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiFallback")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiFallback(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
