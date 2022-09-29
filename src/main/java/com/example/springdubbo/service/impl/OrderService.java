package com.example.springdubbo.service.impl;

import com.example.springdubbo.service.IOrderService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

@DubboService
public class OrderService implements IOrderService {

    @Override
    public String test(String name) {
        System.out.println("我被执行！");
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        int i = 1/0;

        return "I am orderService " + name;
    }
}
