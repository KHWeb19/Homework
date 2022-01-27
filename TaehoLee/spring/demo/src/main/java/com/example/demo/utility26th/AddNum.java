package com.example.demo.utility26th;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
public class AddNum implements Runnable {
    private static int test;
    private static Lock lock;
    private int addedNum;
    private int delay;

    public AddNum(int startNum, int addedNum, int delay){
        this.addedNum = addedNum;
        this.delay = delay;
        test = startNum;
        lock = new ReentrantLock();
    }


    public static int gettmpTest() {
        int tmp;

        lock.lock();
        tmp = AddNum.test;
        lock.unlock();

        return tmp;
    }

    @Override
    public void run(){
        while(true) {
            try {
                lock.lock();
                test += addedNum;
                Thread.sleep(delay);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println("Check " + test + " tmp " + gettmpTest());
        }
    }
}
 */
