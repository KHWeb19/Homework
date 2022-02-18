package com.example.demo.service.proBank10;

import com.example.demo.entity.proBank10.Product;
import com.example.demo.repository.proBank10.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
   public void register(Product product) {
        repository.create(product);

    }
    @Override
   public List<Product> list() {
       return repository.list();
    }

    @Override
    public Product read(Integer boardNo) {
        return repository.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.delete(boardNo);
    }

    @Override
    public void modify(Product product) {
        repository.upDate(product);
    }
}
