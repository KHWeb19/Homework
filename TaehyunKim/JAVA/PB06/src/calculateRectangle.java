import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class calculateRectangle implements Runnable{

    private float x,y;
    private float DIVIDER = 0.001f;

    private int count;

    private float sum;
    private Lock lock;

    public calculateRectangle(float x, float y){
        this.x = x;
        this.y = y;

        count = (int) (x / DIVIDER);

        lock = new ReentrantLock();

    }

    public void calculateSum(){
        for (int i =0; i<=count; i++){
            sum += DIVIDER * y;
        }
    }

    @Override
    public void run(){
        try{
            lock.lock();
            calculateSum();
            System.out.println(sum);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }

    }
}
