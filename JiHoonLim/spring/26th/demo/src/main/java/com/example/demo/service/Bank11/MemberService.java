package com.example.demo.service.Bank11;

import com.example.demo.entity.Bank11.MemberManage;

import java.util.List;

public interface MemberService {
    public void register (MemberManage memberManage);
    public List<MemberManage> list();
    public MemberManage read (Integer memberNo);
    public void modify(MemberManage memberManage);
    public void remove(Integer memberNo);
    public Boolean login(MemberManage memberManage);
}
