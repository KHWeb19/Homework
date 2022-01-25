import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Xvalue {
    private float x1line;
    private float x2line;
    private Lock lock;

    public Xvalue() {
        lock = new ReentrantLock();
    }

    public float x1lineValue(){
        try {
            lock.lock();
            float sum = 0;
            sum += SquaredAndSum2.BASIC;
            x1line += sum;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return x1line;
    }

    public float x2lineValue(){
        try {
            lock.lock();
            float sum = 0;
            sum += SquaredAndSum2.BASIC;
            x2line += sum;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return x2line;

    }

    public float multyValue() {
        return  x1line * x2line;

    }
}
