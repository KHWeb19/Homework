package com.example.demo.service.order32;

import com.example.demo.entity.order32.Board;
import com.example.demo.repository.order32.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository repository;


    @Override
    public List<Board> list() {
        return repository.list();
    }

    @Override
    public void register() {

    }
}
