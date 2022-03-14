package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBoardServiceImpl implements ProductBoardService {

    @Autowired
    ProductBoardRepository repository;

    @Override
    public void register(Product productBoard) {
        repository.create(productBoard);
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
    public void modify(Product productBoard) {
        repository.update(productBoard);
    }

    @Override
    public void remove(Integer productNo) {
        repository.delete(productNo);
    }
}
