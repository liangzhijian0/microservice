package com.controller;

import com.pojo.Item;
import com.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ItemController {
    @Resource
    private ItemService itemService;

    @GetMapping(path = "/item/{id}")
    public Item queryItemById(@PathVariable(name = "id") Long id) {
        return itemService.findItemById(id);
    }
}
