package com.example.demo;

import lombok.SneakyThrows;

public class CalcTest extends Thread{
    private static int test ;

    public CalcTest(){
        test = 0;
    }

    public static int getTest(){
        int tmp;

        tmp = test;

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run(){
        for (;;){
            try{
                test++;
            }catch (Exception e){
                e.printStackTrace();
            }
            Thread.sleep(3000);
        }

    }
}
