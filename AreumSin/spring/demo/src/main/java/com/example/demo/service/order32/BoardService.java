package com.example.demo.service.order32;

import com.example.demo.entity.order32.Board;

import java.util.List;

public interface BoardService {
    public void register(Board board);
    // 데이터를 보내야하는데 데이터 보내는 양식이 다다름 관리하기 쉬울까..? no 관리 힘듬.

    public List<Board> list ();

    public Board read (Integer boardNo);
    public void modify (Board board);
    public void remove (Integer boardNo);
}
