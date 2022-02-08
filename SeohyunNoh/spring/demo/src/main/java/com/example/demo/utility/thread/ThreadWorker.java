package com.example.demo.utility.thread;


import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread {
    private static int test;

    private static Lock lock;

    public ThreadWorker(){
        ThreadWorker.test = 0;
        lock = new ReentrantLock();
    }

    public static int getSyncLockTest(){
        int tmp;

        // 현재 +, - 등 critical section의 값을
        // 갱신(write)하는 것이 아니므로
        // lock, unlock을 할 필요없다
        // lock.lock();
        tmp = ThreadWorker.test;
        // lock.unlock();

        return tmp;
    }


    @SneakyThrows
    @Override
    public void run() {
        for(;;){
        try{
            lock.lock();

            ThreadWorker.test += 1;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        // lock을 풀어준 후 sleep거는게 좋음
        Thread.sleep(3000);
        }
    }
}
