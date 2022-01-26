package com.example.demo.utility.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread {
    private static int test; //critical section이기 때문에 lock이 필요하다

    private static Lock lock;

    public ThreadWorker () {
        ThreadWorker.test = 0;
        lock = new ReentrantLock();
    }

    // 값을 갱신(write)하는 구조가 아니므로 Lock이 필요 없음
    public static int getSyncLockTest () {  //다른 클래스에서 이 메서드를 사용할 수 있도록 static으로 선언
        int tmp;
        //lock.lock();
        tmp = ThreadWorker.test;
        //lock.unlock();

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (;;) {
            try {
                lock.lock();
                //ThreadWorker.test += 1;
                ThreadWorker.test++;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

            Thread.sleep(3000);
        }
    }
}