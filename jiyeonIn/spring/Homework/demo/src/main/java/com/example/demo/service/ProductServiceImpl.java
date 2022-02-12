package com.example.demo.service;

import com.example.demo.entity.order34.Product34th;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repository;

    @Override
    public void register(Product34th product) {
        repository.create(product);
    }


    @Override
    public List<Product34th> list() {
        return repository.list();
    }

    @Override
    public Product34th read(Integer board_no) {
        return repository.read(board_no);
    }

    @Override
    public void modify(Product34th product) {
        repository.modify(product);
    }

    @Override
    public void remove(Integer board_no) {
        repository.remove(board_no);
    }
}
