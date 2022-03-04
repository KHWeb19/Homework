package com.example.demo.service.Bank12;

import com.example.demo.entity.Bank12.GradeManage;

import java.util.List;

public interface GradeService {
    public void register (GradeManage gradeManage);
    public List<GradeManage> list();
    public GradeManage read (Integer studentNo);
    public void modify(GradeManage gradeManage);
    public void remove(Integer studentNo);

}
