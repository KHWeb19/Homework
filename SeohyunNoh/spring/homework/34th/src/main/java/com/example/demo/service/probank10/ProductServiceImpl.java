package com.example.demo.service.probank10;

import com.example.demo.entity.probank10.Product;
import com.example.demo.repository.probank10.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public void register(Product product) {
        repository.create(product);
    }

    @Override
    public List<Product> list() {
        return repository.list();
    }

    @Override
    public Product read(Integer boardNo) {
        return repository.read(boardNo);
    }

    @Override
    public void modify(Product product) {
        repository.update(product);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.delete(boardNo);
    }
}
