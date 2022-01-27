import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Square implements Runnable {
    public int row;
    public int cal;
    public double slice;            ///--> 0.001
    public int cnt = 0;
    public double sum = 0;
    public Lock lock;

    public Square(int row, int cal, double slice) {
        this.row = row;
        this.cal = cal;
        this.slice = slice;
        int area = row * cal;
        System.out.println("Square Area : " + area);
        //Square Area : 4
        lock = new ReentrantLock();
    }

    public void calcCnt() {
        for (double i = slice; i < row; i += slice) {
            cnt++;
        }
        System.out.println("Count Num : " + cnt);
        //Count Num : 2000
    }


    public void calcArea() {
        try {
            lock.lock();
            sum += slice * cal;
            System.out.println("Current Square Area : " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        calcCnt();
        for (int i = 0; i < cnt; i++) {
            calcArea();
        }
        System.out.println("Final Square Area : "+ sum);
        //Final Square Area : 3.999999999999781
    }
}
