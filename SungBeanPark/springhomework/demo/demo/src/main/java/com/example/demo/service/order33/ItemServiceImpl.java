package com.example.demo.service.order33;


import com.example.demo.entity.order33.Item;
import com.example.demo.repository.order33.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository repository;

    @Override
    public void register(Item item) {
        repository.create(item);
    }

    @Override
    public List<Item> list() {
        return repository.list();
    }

    @Override
    public Item read(Integer itemId) {
        return repository.read(itemId);
    }

    @Override
    public void modify(Item item) {
        repository.update(item);
    }

    @Override
    public void remove(Integer itemId) {
        repository.delete(itemId);
    }
}
