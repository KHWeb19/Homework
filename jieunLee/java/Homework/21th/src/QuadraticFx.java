import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class QuadraticFx implements Runnable{
    final float TINY = 0.001f;
    final float WIDTH = 3;
    private static int height;
    private static int count;
    private static float sum;
    private Lock lock;

    public QuadraticFx() {
        height = (int)(Math.pow(WIDTH, 2));
        count = (int)(WIDTH/TINY);
        sum = 0;
        lock = new ReentrantLock();
    }

    public void add() {
        try {
            lock.lock();
            sum += (TINY*height);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        for (int i=0; i<count; i++) {
            add();

        }
        System.out.println(sum);
    }
}
