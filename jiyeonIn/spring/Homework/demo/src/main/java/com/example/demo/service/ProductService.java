package com.example.demo.service;

import com.example.demo.entity.order34.ProductList;

import java.util.List;

public interface ProductService {
    public void register(ProductList product);
    public List<ProductList> list();
    public ProductList read(Integer boardNo);
    public void modify (ProductList product);
    public void remove (Integer board_no);
}
