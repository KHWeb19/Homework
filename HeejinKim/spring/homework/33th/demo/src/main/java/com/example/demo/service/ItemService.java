package com.example.demo.service;

import com.example.demo.entity.Item;

import java.util.List;

public interface ItemService {  //인터페이스
                                // 사용하는 엔티티(Item)는 동일하나 다른 여러가지 작업을 하기위해 오염도를 낮추기 위함

    public void register (Item item);
    public List<Item> list();
    public Item read(Integer itemNo);
    public void modify(Item item);    //수정한 것은 DB에 있는 것이 아니라 살아있는 객체에 있기 때문에 board를 전달
    public void remove(Integer itemNo);






    }

