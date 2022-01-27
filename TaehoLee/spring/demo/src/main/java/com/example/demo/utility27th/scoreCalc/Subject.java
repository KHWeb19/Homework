package com.example.demo.utility27th.scoreCalc;

public class Subject {
    final int SUBJECTCOUNT = 3;
    final String[] subjectName = new String[SUBJECTCOUNT];

    public Subject(){
        subjectName[0] = "Korean";
        subjectName[1] = "Math";
        subjectName[2] = "English";
    }

    public String getSubjectName(int idx) {
        return subjectName[idx];
    }
}
