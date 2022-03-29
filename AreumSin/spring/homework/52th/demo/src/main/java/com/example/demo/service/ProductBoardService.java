package com.example.demo.service;

import com.example.demo.entity.Product;

import java.util.List;

public interface ProductBoardService {
    public void register (Product productBoard);
    public List<Product> list ();
    public Product read (Integer productNo);
    public void modify (Product productBoard);
    public void remove (Integer productNo);
}
