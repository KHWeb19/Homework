package com.example.demo.service.order37;

import com.example.demo.entity.order37.MemberManagementSystem;

import java.util.List;

public interface MemberManagementSystemService {
    public void join(MemberManagementSystem memberManagementSystem);

    public List<MemberManagementSystem> list();

    public MemberManagementSystem read(Integer memberNo);

    public void modify(MemberManagementSystem memberManagementSystem);

    public void remove(Integer memberNo);

}


