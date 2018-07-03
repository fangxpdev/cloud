package com.beidou.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author beidou
 * @since 18/7/2
 */
@Component
public class HystrixSchedualSericeHi implements ScheduleServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "hi," + name + ",hystrix enable";
    }
}
