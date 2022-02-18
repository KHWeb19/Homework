package com.example.demo.service;

import com.example.demo.entity.BankBoard;
import com.example.demo.repository.BankBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankBoardServiceImpl implements BankBoardService { //저장소랑 연결됨

    @Autowired
    BankBoardRepository bankBoardRepository;

    @Override
    public List<BankBoard> list() {

        return bankBoardRepository.list();
    }

    @Override
    public void register(BankBoard bankBoard) {

        bankBoardRepository.create(bankBoard);

    }

    @Override
    public BankBoard read(Integer memberNo) {
        return  bankBoardRepository.read(memberNo);
    }

    @Override
    public void modify(BankBoard bankBoard) {

        bankBoardRepository.update(bankBoard);

    }

    @Override
    public void remove(Integer memberNo) {

        bankBoardRepository.delete(memberNo);

    }
}
