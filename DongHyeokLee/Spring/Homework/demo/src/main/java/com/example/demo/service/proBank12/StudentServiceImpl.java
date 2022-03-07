package com.example.demo.service.proBank12;

import com.example.demo.entity.proBank12.Student;
import com.example.demo.repository.proBank12.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository repository;


    //개선하고 싶은 점
    // list 객체화 반복
    // 과목별 코드 반복
    // 서비스 코드 생성해야되나?
    //평균 구하는 매서드를 service에 만드는게 맞나?

    @Override
    public int classAvg() {
        List<Student> list = repository.list();
        int avg;
        int sum = 0;

        for(int i = 0; i < list.size(); i++){
            Student studentElem = list.get(i);
            avg= (studentElem.getKoreanScore() + studentElem.getEnglishScore() + studentElem.getMathScore()) / 3;
            sum += avg;
        }

        return sum/list.size();
    }

    /*@Override
    public int myAvg(Student student) {

        int avg = (student.getEnglishScore() + student.getKoreanScore() + student.getMathScore()) / 3;

        return avg;
    }*/


    @Override
    public int koreanAvg() {
        List<Student> list = repository.list();
        int sum = 0;

        for(int i = 0; i < list.size(); i++){
            Student studentElem = list.get(i);
            sum += studentElem.getKoreanScore();
        }

        return sum/list.size();
    }

    @Override
    public int englishAvg() {
        List<Student> list = repository.list();
        int sum = 0;

        for(int i = 0; i < list.size(); i++){
            Student studentElem = list.get(i);
            sum += studentElem.getEnglishScore();
        }

        return sum/list.size();
    }

    @Override
    public int mathAvg() {
        List<Student> list = repository.list();
        int sum = 0;


        for(int i = 0; i < list.size(); i++){
            Student studentElem = list.get(i);
            sum += studentElem.getMathScore();
        }

        return sum/list.size();
    }

    @Override
    public List<Student> list() {
        List<Student> list = repository.list();
        int myAvg;

        for (int i = 0; i < list.size(); i++) {

            Student studentElem = list.get(i);
            myAvg = (studentElem.getKoreanScore() + studentElem.getEnglishScore() + studentElem.getMathScore()) / 3;

            studentElem.setMyAvg(myAvg);

            list.set(i, studentElem);
        }


        return list;
    }

    @Override
    public void register(Student student) {
        repository.create(student);
    }


}
