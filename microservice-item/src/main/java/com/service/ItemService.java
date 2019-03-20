package com.service;

import com.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {
    private static final Map<Long, Item> MAP = new HashMap<Long, Item>();

    static {
        MAP.put(1L, new Item(1L, "title1", "http://pic1", "desc1", 1000L));
        MAP.put(2L, new Item(2L, "title2", "http://pic2", "desc2", 1000L));
        MAP.put(3L, new Item(3L, "title3", "http://pic3", "desc3", 1000L));
        MAP.put(4L, new Item(4L, "title4", "http://pic4", "desc4", 1000L));
        MAP.put(5L, new Item(5L, "title5", "http://pic5", "desc5", 1000L));
    }

    public Item findItemById(Long id) {
        return MAP.get(id);
    }
}
