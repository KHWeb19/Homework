package com.example.demo.controller;

public class ThreadTest implements Runnable{
// 2. 3초마다 test라는 변수의 값을 1씩 증가시키도록 한다.
// 또한 /homework2 URL을 요청하면
// 현재의 test 값을 화면에 출력되게 만들어보자!

    protected static int test = 1;

    public ThreadTest(){
        test++;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
