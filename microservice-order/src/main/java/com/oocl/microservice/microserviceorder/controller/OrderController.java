package com.oocl.microservice.microserviceorder.controller;

import com.oocl.microservice.microserviceorder.pojo.Order;
import com.oocl.microservice.microserviceorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @Value("${from}")
    private String from;

    @GetMapping(path = "/order/{orderId}")
    public Order getOrderByOrderId(@PathVariable(name = "orderId") String orderId) {
        System.out.println(from);
        return orderService.getOrderById(orderId);
    }
}
