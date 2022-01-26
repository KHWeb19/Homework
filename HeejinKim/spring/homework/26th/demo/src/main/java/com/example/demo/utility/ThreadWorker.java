package com.example.demo.utility;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread{

    private static int test;
    private static Lock lock; //필요없지만 넣어보겠음

    public ThreadWorker(){
        ThreadWorker.test=0; //정확히 해주기위해서 //초기화
        lock = new ReentrantLock();
    }

    public static int getLockTest(){ //메서드 자체가 전역 메서드
        int tmp; //일시적을 값을 저장

        lock.lock();            // 락이 필요 없는 이유는 값을 갱신하는 구조가 run밖에 없기 때문이다
        tmp=ThreadWorker.test;  //값 넣고
        lock.unlock();          //락 풀어서 리턴함

        return tmp;
   }


    @SneakyThrows
    @Override
    public void run() { //실행만 되는 부분
        for(int i=0;i<10;i++){
            try {
                lock.lock(); // 락 한 값을 가져옴
                ThreadWorker.test+=1;
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            Thread.sleep(3000);
        }

    }
}
