package com.example.demo.service.Bank10;

import com.example.demo.entity.Bank10.Product;


import java.util.List;

public interface BoardService {
    public void register (Product product);
    public List<Product> list ();
    public Product read (Integer boardNo);
    public void modify (Product product);
    public void remove (Integer boardNo);
}
