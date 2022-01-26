package com.example.demo.utility.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadManager extends Thread {

    private static int test;
    private Lock lock;

    public ThreadManager()  {
        test = 0;
        lock = new ReentrantLock();
    }

    public static int getTest(){
        return test;
    }


    public void plusOne() throws InterruptedException {
        boolean addOne = true;
        while (addOne){
            test++;
            Thread.sleep(3000);
            if(test>100){
                addOne = false;
            }
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            lock.lock();
            plusOne();
            } catch (InterruptedException ex) {
            ex.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
