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

    @Override
    public Boolean login(BankBoard bankBoard) {
        BankBoard findMember = bankBoardRepository.findMemberById(bankBoard);

        if (findMember == null) {
            System.out.printf("There are no %s id\n", bankBoard.getBank_Id());
            return false;
        }

        System.out.println("Check Password Only: " + findMember);
        Boolean loginSuccess = findMember.getBankPassword().equals(bankBoard.getBankPassword());

        return loginSuccess;
    }
}



