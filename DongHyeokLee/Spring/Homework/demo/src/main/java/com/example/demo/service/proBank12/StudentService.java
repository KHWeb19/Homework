package com.example.demo.service.proBank12;


import com.example.demo.entity.proBank12.Student;

import java.util.List;

public interface StudentService {
        //public int myAvg(Student student);
        public List<Student> list();
        public void register (Student student);
        public int classAvg();
        public int koreanAvg();
        public int englishAvg();
        public int mathAvg();

}
