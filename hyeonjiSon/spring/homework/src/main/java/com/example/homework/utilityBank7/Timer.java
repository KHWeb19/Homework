package com.example.homework.utilityBank7;

public class Timer extends Thread {

    private int i = 0;


    @Override
    public void run() {
        super.run();
        while (true) { //무한반복 되는 동안
            try {
                i++; //i가 반복마다 +1씩 증가
                sleep(3000); //
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
        while (true) { //무한반복 되는 동안
            try {
                i++; //i가 반복마다 +1씩 증가
                sleep(3000); //
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
 */