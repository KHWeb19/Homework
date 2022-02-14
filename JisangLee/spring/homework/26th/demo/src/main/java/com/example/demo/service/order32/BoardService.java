package com.example.demo.service.order32;

import com.example.demo.entity.order32.ProductBoard;

import java.util.List;

public interface BoardService {
    public void register (ProductBoard productBoard);
    public List<ProductBoard> list();
    public ProductBoard read (Integer boardNo);
    public void modify (ProductBoard productBoard);
    public void remove (Integer boardNo);



}
