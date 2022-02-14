package com.example.demo.service.order32;

import com.example.demo.entity.order32.ProductBoard;
import com.example.demo.repository.order32.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardRepository repository;

    @Override
    public void register(ProductBoard productBoard) {
        repository.create(productBoard);
    }

    @Override
    public List<ProductBoard> list() {
        return repository.list();
    }
    @Override
    public ProductBoard read(Integer boardNo){
        return repository.read(boardNo);
    }
    @Override
    public void modify(ProductBoard productBoard){
        repository.update(productBoard);
    }
    @Override
    public void remove(Integer boardNo){
        repository.delete(boardNo);
    }

}


