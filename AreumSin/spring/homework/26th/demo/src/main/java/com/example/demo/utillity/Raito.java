package com.example.demo.utillity;

import lombok.Data;

import java.util.Scanner;

@Data
public class Raito {

    Scanner scanner = new Scanner(System.in);
    int number =1;
    int num;
    public Raito(){
        System.out.print("숫자를 입력해주세요: ");
        num = scanner.nextInt();

        addNum(num);
        // 1, 2, 4, 8, 16
        // 공비는 2
    }

    public void addNum(int num){
        for(int i =0; i < num; i++){
            number *= 2;
        }
    }

}
