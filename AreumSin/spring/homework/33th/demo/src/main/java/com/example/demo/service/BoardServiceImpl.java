package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardRepository repository;

    @Override
    public void register(Board board) {
        repository.create(board);
    }

    @Override
    public List<Board> list() {
        return repository.list();
    }
}
