package com.springboot.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/6下午10:53
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "sorry " + name;
    }
}
