package com.example.demo.utility;

import lombok.Data;

import java.util.Scanner;

@Data

public class Geometric {

    private  int R = 2; // 공비는 일정 한 값이기 때문에 미리 선언함
    private final int END=31;

    private int  arr[]  =new int[END];
    int num;



    public void allocGeometric(){
        arr[0]=1;
      for(int i=1; i<END; i++){
          arr[i]=arr[i-1]*R;
      }
      num=arr[END-1];
    }

}


