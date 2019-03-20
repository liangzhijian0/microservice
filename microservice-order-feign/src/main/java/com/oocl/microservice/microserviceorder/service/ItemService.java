package com.oocl.microservice.microserviceorder.service;

import com.oocl.microservice.microserviceorder.feignInterface.ItemClient;
import com.oocl.microservice.microserviceorder.pojo.Item;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ItemService {
    @Resource
    private ItemClient itemClient;

    Item getItemById(Long id) {
        return itemClient.consumer(id);
    }

}
