package com.example.bank.service.order32;

import com.example.bank.entity.order32.Board;

import java.util.List;

public interface BoardService {
    //등록 시 리턴은 안함 (Board 클래스의 board 필요)
    public void register (Board board);
    public List<Board> list ();
    //읽기 시 Board 클래스 리턴 (boardNo만 있으면 읽기 가능)
    public Board read (Integer boardNo);
    public void modify (Board board);
    public void remove (Integer boardNo);
}
