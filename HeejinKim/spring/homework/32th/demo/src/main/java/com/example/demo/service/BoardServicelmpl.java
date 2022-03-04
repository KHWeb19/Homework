package com.example.demo.service;

import com.example.demo.entity.order32.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Controller의 서비스를 연결시켜주는 것을 자동화시키는 역할 @Autowired이랑 @service랑 연결시켜줌
public class BoardServicelmpl implements BoardService{ //인터페이스

    @Autowired   //BoardRepository와 연결
    BoardRepository repository;

    @Override
    public void register(Board board) {

    }

    @Override      //인터페이스에서 넘어옴
    public List<Board> list() {
        return repository.list();
    }
}
