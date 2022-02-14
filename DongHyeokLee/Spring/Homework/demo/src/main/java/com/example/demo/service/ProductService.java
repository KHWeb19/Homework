package com.example.demo.service;

import com.example.demo.entity.proBank10.Product;

import java.util.List;

public interface ProductService {
    public void register (Product product);
    public List<Product> list();
    public Product read(Integer boardNo);
    public void modify(Product product);
    public void remove (Integer boardNo);
}
