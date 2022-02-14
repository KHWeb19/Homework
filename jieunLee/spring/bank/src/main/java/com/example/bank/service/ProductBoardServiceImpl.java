package com.example.bank.service;

import com.example.bank.entity.ProductBoard;
import com.example.bank.repository.ProductBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBoardServiceImpl implements ProductBoardService {
    @Autowired
    ProductBoardRepository repository;

    @Override
    public void register(ProductBoard productBoard) {
        repository.create(productBoard);
    }

    @Override
    public List<ProductBoard> list() {
        return repository.list();
    }

    @Override
    public ProductBoard read(Integer productNo) {
        return repository.read(productNo);
    }

    @Override
    public void modify(ProductBoard productBoard) {
        repository.update(productBoard);
    }

    @Override
    public void remove(Integer productNo) {
        repository.delete(productNo);
    }



}
