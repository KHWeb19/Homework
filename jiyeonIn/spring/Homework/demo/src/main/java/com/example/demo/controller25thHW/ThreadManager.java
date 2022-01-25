package com.example.demo.controller25thHW;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadManager extends Thread {

    static int test;
    static Lock lock;

    public ThreadManager()  {
        test = 0;
        lock = new ReentrantLock();
    }

    public static void plusOne() throws InterruptedException {
        boolean addOne = true;
        while (addOne){
            test++;
            Thread.sleep(3000);
            if(test>100){
                addOne = false;
            }
            System.out.println(test);
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
/*
//3초마다 1씩 증가하는 값을 만든다.
//그리고 새로고침 할때마다 증가하는 그 값을 출력하도록 한다.(??)
//우선 consol창에는 3초마다 한번씩 값이 잘 나옴. 근데 그거를 웹 상에 출력하는거를 못하겠음

run()을 넣었을때는 0만 출력(콘솔창 안에서는 1씩 증가하고있음),
start()를 하면 아예 오류가 난다.
어떻게 만들어야할까? 혹시 몰라서 test++하는 곳을 static으로 만들었는데도 따로 변동없음.
그곳을 return형으로 만들어도 안됨...test의 증가하는 값을 웹 상에 업데잇 하는 방법이 뭐가 있을까
 */

