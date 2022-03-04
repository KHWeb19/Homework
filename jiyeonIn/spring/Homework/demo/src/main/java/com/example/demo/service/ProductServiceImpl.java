package com.example.demo.service;

import com.example.demo.entity.order34.ProductList;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repository;

    @Override
    public void register(ProductList productList) {
        repository.create(productList);
    }


    @Override
    public List<ProductList> list() {
        return repository.list();
    }

    @Override
    public ProductList read(Integer board_no) {
        return repository.read(board_no);
    }

    @Override
    public void modify(ProductList productList) {
        repository.modify(productList);
    }

    @Override
    public void remove(Integer board_no) {
        repository.remove(board_no);
    }
}
