package com.example.demo.service.Bank12;

import com.example.demo.entity.Bank12.GradeManage;
import com.example.demo.repository.Bank12.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    GradeRepository repository;


    @Override
    public void register(GradeManage gradeManage) {
        repository.create(gradeManage);
    }

    @Override
    public List<GradeManage> list() {
        List<GradeManage> list = repository.list();

        int avg;

        for (int i = 0; i < list.size(); i ++){
            GradeManage gradeElem = list.get(i);
            avg = (gradeElem.getKorean() + gradeElem.getEnglish() + gradeElem.getMath()) / 3;
            gradeElem.setAvg(avg);
            list.set(i, gradeElem);
        }

        return list;
    }

    @Override
    public GradeManage read(Integer studentNo) {
        return repository.read(studentNo);
    }

    @Override
    public void modify(GradeManage gradeManage) {
        repository.update(gradeManage);
    }

    @Override
    public void remove(Integer studentNo) {
        repository.delete(studentNo);
    }
}
