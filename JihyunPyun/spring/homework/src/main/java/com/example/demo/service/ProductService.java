package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;


public interface ProductService {
    public void register (Product product);
    public void delete (Integer boardNo);
    public List<Product> list();
    public void modify (Product product);
    public Product read(Integer boardNo);
}
