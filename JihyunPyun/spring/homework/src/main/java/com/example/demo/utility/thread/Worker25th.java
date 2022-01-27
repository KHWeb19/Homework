package com.example.demo.utility.thread;

import lombok.Data;
import lombok.SneakyThrows;

public class Worker25th extends Thread  {
    public static int test;
    public Worker25th (){}

    @SneakyThrows
    @Override
    public void run() {
        while (true){
            test++;
            Thread.sleep(3000);
        }
    }
}
