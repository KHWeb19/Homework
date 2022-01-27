package com.example.demo.utility.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest implements Runnable {
    private static int test;
    private static Lock lock;

    public ThreadTest (){
        ThreadTest.test = 0;
        lock = new ReentrantLock();
    }

    public static int getSyncTest(){
        int tmp;

        tmp = ThreadTest.test;

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run() {
        for(;;){
            try{
                lock.lock();
                ThreadTest.test += 1;
            } catch(Exception e){
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            Thread.sleep(3000);
        }
    }
}
