package com.example.demo.service.probank11;

import com.example.demo.entity.probank11.MemberManage;
import com.example.demo.repository.probank11.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository repository;

    @Override
    public void register(MemberManage memberManage) {
        repository.create(memberManage);
    }

    @Override
    public List<MemberManage> list() {
        return repository.list();
    }

    @Override
    public MemberManage read(Integer memberNo) {
        return repository.read(memberNo);
    }

    @Override
    public void modify(MemberManage memberManage) {
        repository.update(memberManage);
    }

    @Override
    public void remove(Integer memberNo) {
        repository.delete(memberNo);
    }
}
