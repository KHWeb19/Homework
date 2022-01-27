package com.example.demo.utility.student;

public class Student {
    int[] students = new int[30];

    private final int MIN = 61;
    private final int MAX = 100;
    private int range = MAX - MIN + 1;

    private int sum = 0;

    public Student(){
        for (int i =0; i<students.length; i++){
            students[i] = (int)(Math.random()*range+MIN);
        }
    }

    public float getAverage(){
        for (int i = 0; i<students.length; i++){
            sum += students[i];
        }

        return (float) sum/students.length;
    }
}
