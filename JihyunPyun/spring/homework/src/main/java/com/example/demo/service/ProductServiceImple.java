package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImple implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void register(Product product) {
        productRepository.create(product);
    }

    @Override
    public void delete(Integer board_no) {
        productRepository.delete(board_no);
    }

    @Override
    public List<Product> list() {
        return productRepository.list();
    }

    @Override
    public void modify(Product product) {
        productRepository.modify(product);
    }

    @Override
    public Product read(Integer board_no) {
        return productRepository.read(board_no);
    }
}
