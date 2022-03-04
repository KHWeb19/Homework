package com.example.demo.service.order37;

import com.example.demo.entity.order37.MemberManagementSystem;
import com.example.demo.repository.order37.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberManagementSystemServiceImpl implements MemberManagementSystemService {

    @Autowired
    MemberRepository repository;

    @Override
    public void join(MemberManagementSystem memberManagementSystem){
        repository.create(memberManagementSystem);
    }

    @Override
    public List<MemberManagementSystem> list() {
        return repository.list();
    }

    @Override
    public MemberManagementSystem read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public void modify(MemberManagementSystem memberManagementSystem) {
        repository.update(memberManagementSystem);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.delete(memberNo);

    }
}
