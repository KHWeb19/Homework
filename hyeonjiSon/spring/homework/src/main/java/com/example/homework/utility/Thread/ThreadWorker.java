package com.example.homework.utility.Thread;

import lombok.SneakyThrows;

public class ThreadWorker extends Thread {
    private static int i = 0;

    public static int getNum () {
        int tmp;

        //lock.lock();
        tmp = ThreadWorker.i;
        //lock.unlock();

        return tmp;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            try {
                i++;
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
