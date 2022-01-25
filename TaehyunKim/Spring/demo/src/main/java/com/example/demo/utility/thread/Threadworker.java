package com.example.demo.utility.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threadworker extends Thread{

    private static int test;

    private static Lock lock;

    public Threadworker(){
        test = 0;
        lock = new ReentrantLock();

    }

    public static int getSyncLockTest(){
        int tmp;

        lock.lock();
        tmp = Threadworker.test;
        lock.unlock();

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run(){
        for (;;){
        try{
            lock.lock();
            Threadworker.test += 1;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
            Thread.sleep(3000);

        }
    }
}
