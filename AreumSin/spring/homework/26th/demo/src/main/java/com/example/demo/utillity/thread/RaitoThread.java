package com.example.demo.utillity.thread;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaitoThread extends Thread {
    Scanner scanner = new Scanner(System.in);

    static int number;
    private int num;
    private static Lock lock;

    public RaitoThread(){
        RaitoThread.number = 0;

        System.out.print("Number : ");
        num = scanner.nextInt();

        lock = new ReentrantLock();
    }

    public static int addNum(){
        int tmp;

        tmp = RaitoThread.number;

        return tmp;
    }


    @SneakyThrows
    @Override
    public void run() {
        System.out.println(num);
        for(int i = 0; i < num; i++) {
            try {
                lock.lock();
                RaitoThread.number *= 2;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            Thread.sleep(3000);
        }
    }

    /*
    public static int getNumber() {
        return number;
    }

     */
}
