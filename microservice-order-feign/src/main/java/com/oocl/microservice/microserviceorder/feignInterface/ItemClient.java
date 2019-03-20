package com.oocl.microservice.microserviceorder.feignInterface;

import com.oocl.microservice.microserviceorder.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Ocean Liang
 * @date 3/20/2019
 */
@FeignClient("micro-service-item")
public interface ItemClient {
    @GetMapping("/item/{id}")
    Item consumer(@PathVariable("id") Long id);
}
