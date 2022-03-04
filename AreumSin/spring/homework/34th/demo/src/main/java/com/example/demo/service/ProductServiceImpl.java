package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.rpository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public void register(Product product) {
        repository.register(product);
    }

    @Override
    public List<Product> list() {
        return repository.list();
    }

    @Override
    public Product read(Integer productNo) {
        return repository.read(productNo);
    }

    @Override
    public void modify(Product product) {
        repository.modify(product);
    }

    @Override
    public void remove(Integer productNo) {
        repository.remove(productNo);
    }

}
