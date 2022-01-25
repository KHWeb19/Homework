package com.example.demo.homework;

public class Timer extends Thread {

    private int i = 0;

    @Override

    public void run(){

        while (true){
            try{
                i++;
                sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
