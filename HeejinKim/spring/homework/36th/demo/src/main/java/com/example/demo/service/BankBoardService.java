package com.example.demo.service;

import com.example.demo.entity.BankBoard;

import java.util.List;

public interface BankBoardService {// 서비스에  들어가는 것---목록,읽기,등록,수정,제거(탈퇴)


    public List<BankBoard> list();
    public void register (BankBoard bankBoard);
    public BankBoard read (Integer memberNo);
    public void modify (BankBoard bankBoard);
    public void remove (Integer memberNo);
    public Boolean login (BankBoard bankBoard);

}
