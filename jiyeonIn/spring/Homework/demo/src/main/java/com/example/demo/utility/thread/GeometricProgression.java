package com.example.demo.utility.thread;


import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GeometricProgression extends Thread {
    /*
    등비수열 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, ...
    2의 0승 1승, .... 이런식으로 값을 구하기.
    그렇다면, 3초마다 등비수열의 값이 나오도록 출력 해 보면 어떨까?
    !! 혹시 배열 응용해서 풀 수 있는 방법 있을까요? 배열로 하려고 하니,
    for문 돌리면 return으로 각 값이 나오지 않고, 최종 값만 표시가 됩니다.!!
     */

    private static int test;
    private static int tmp;
    private Lock lock;  // 여기서는 lock이 필요없나요?
                        // 계산 중 get을 호출한다고 해도, 그냥 호출만 하는거지 값을 변하게 하지 않는거라서
                        // lock이 필요가 없는 건가요?
                        // 확인해보니, lock을 쓰지 않아도 값이 아주 잘 나옵니다.

    public GeometricProgression(){
        test = 0;
        //lock = new ReentrantLock();
    }


    public static int getGeometric() {
        return tmp;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (;;) {
            try {
                tmp = (int) (Math.pow(2, test++));

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }
            Thread.sleep(3000);
        }
    }
}
