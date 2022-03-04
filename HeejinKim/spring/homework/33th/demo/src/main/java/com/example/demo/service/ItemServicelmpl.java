package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServicelmpl implements ItemService {

    @Autowired//repository랑 연결
    ItemRepository repository;

    @Override
    public void register(Item item) {
        repository.create(item);
    }

    @Override
    public  List<Item> list() {

        return repository.list();
    }

    @Override
    public Item read(Integer itemNo) {
        return repository.read(itemNo);
    }

    @Override
    public void modify(Item item) {
        repository.update(item);
    }

    @Override
    public void remove(Integer itemNo) {
        repository.delete(itemNo);

    }
}
