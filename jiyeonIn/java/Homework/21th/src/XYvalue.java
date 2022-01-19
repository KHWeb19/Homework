import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class XYvalue {
    private float xline;
    private float yline;
    private Lock lock;

    public XYvalue() {
        lock = new ReentrantLock();
    }

    public float xlineValue(){
        try {
            lock.lock();
            float sum = 0;
            sum += SquaredAndSum2.BASIC;
            xline += sum;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return xline;
    }

    public float ylineValue(){
        try {
            lock.lock();
            float sum = 0;
            sum += SquaredAndSum2.BASIC;
            yline += sum;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

        return yline;

    }

    public float multyValue() {
        return  xline * yline;

    }
}
