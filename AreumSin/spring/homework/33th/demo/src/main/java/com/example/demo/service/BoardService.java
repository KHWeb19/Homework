package com.example.demo.service;

import com.example.demo.entity.Board;

import java.util.List;

public interface BoardService {
    public void register (Board board);
    public List<Board> list();

    public Board read (Integer boardNo); // 하나만 읽을거니깐
    public void remove (Integer boardNo);
    public void modify (Board board);
}
