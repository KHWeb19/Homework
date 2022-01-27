package com.example.demo.utility;

import lombok.Data;

@Data
public class Student {
   private final int STUDENT_NUM=30;

   private final int MAX=100;
   private final int MIN=60;
   int[] score = new int[STUDENT_NUM];

   private int rang = MAX- MIN +1;
   int sum = 0;
   float avg;

   public void avgScore(){
      for(int i=0; i<STUDENT_NUM; i++){
         score[i]= (int)(Math.random()*rang+MIN);
         sum +=score[i];

      }
      avg= (float) (sum) / STUDENT_NUM;
   }
}
