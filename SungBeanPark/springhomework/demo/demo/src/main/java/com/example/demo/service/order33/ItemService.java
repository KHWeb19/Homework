package com.example.demo.service.order33;

import com.example.demo.entity.order33.Item;

import java.util.List;

public interface ItemService {
    public void register (Item item);
    public List<Item> list ();
    public Item read (Integer itemId);
    public void modify (Item item);
    public void remove (Integer itemId);
}
