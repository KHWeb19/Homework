package com.example.demo.service.order45;

import com.example.demo.entity.order45.Student;
import com.example.demo.entity.order45.StudentSum;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository repository;


    @Override
    public void register(Student student) {
        repository.create(student);
    }

    @Override
    public List<Student> list() {
        List<Student> list = repository.list();
        Student student = new Student();
        //list에 repository에 있는 값들을 student 클래스에 넣는다.

        int avg;
        int avg2;
        //여기에 avg를 초기화해줘야지 student에 들어가기에 문제 없을 것임. 왜냐면 return은 for문 밖에서 이루어지거든요.

        for(int i = 0; i< list.size(); i++){
        //for문으로 list.size만큼 반복한다.
             student = list.get(i);
            //list에 있는 값들을 i번째대로 student 클래스에 넣는다.

            avg = (student.getKorean() + student.getEnglish() + student.getMath())/3;
            //i번째의 국어+영어+수학/3을 해서 평균을 구한다.
            student.setAvg(avg);
            //student의 avg에 값을 세팅한다.
            list.set(i,student);
            //업데이트 된 student 클래스를 i번째 list를 다시 세팅한다.!!
        }


            avg2 = (student.getKoreanSum() + student.getEnglishSum() + student.getMathSum()) / 3;
            student.setTotalAvg(avg2);



        return list;
        //for문에서 초기화한 list를 return 해줌.
    }

    @Override
    public List<Student> list2() {
        List<Student> list = repository.list();

        for(int i = 0; i< list.size(); i++) {
            Student student = list.get(i);
            int avg = (student.getKoreanSum() + student.getEnglishSum() + student.getMathSum()) / 3;
            student.setTotalAvg(avg);
            list.set(i,student);
        }


        return list;
    }
}
