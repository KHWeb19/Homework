package com.example.bank.service.bank10;

import com.example.bank.entity.bank10.ProductBoard;

import java.util.List;

public interface ProductBoardService {
    public List<ProductBoard> list ();
    public ProductBoard read (Integer productNo);
    public void register (ProductBoard productBoard);
    public void modify (ProductBoard productBoard);
    public void remove (Integer productNo);
}
