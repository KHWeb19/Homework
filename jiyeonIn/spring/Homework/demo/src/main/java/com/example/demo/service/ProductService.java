package com.example.demo.service;

import com.example.demo.entity.order34.Product34th;

import java.util.List;

public interface ProductService {
    public void register(Product34th product);
    public List<Product34th> list();
    public Product34th read(Integer boardNo);
    public void modify (Product34th product);
    public void remove (Integer board_no);
}
