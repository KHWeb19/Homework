package com.example.demo.service.order45;

import com.example.demo.entity.order45.Student;
import com.example.demo.entity.order45.StudentSum;

import java.util.List;

public interface StudentService {
    public void register(Student student);
    public List<Student> list();
    public List<Student> list2();

}
