package com.example.demo.thread;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWorker extends Thread{
    private static int test;    //main에서 부르기 위해서 전역변수로 함
    private static Lock lock;   //test가 전역 변수라 락도 전역변수로 해줌

    public ThreadWorker(){

        ThreadWorker.test=0;           //초기화
        lock = new ReentrantLock();  //락을 초기화

    }

    public static int getSyncLockTest(){ //
        int tmp; //일시적으로 값을 저장

        lock.lock();            //락을 해주고
        tmp=ThreadWorker.test;  //값을 저장하고
        lock.unlock();          //락을 풀어서 그값을 가져온다
                                //하지만 여기서는 락을 쓸필요가 없지만 그래도 한번 만들어봄
        return tmp;
    }


    //스레드를 만들었으면 run!

    @SneakyThrows
    @Override
    public void run() {
        for(int i=0; i<10; i++){

            try{
                lock.lock();            //락을 불러옴
                ThreadWorker.test+=1;   //계산해줌
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();          //마지막으로
            }

            Thread.sleep(3000);
            //루프 마지막에 슬립을 해주면 루프가 돌고 값이 나오면 3초 기다리고 다시 돌아서 값이 나오고 반복
        }


    }
}
