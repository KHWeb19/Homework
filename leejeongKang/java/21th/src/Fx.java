import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fx implements Runnable{
    double x, y;
    double slice;       //--->0.001
    double sum = 0;
    int cnt = 0;
    public Lock lock;

    public Fx (double slice){
        this.slice = slice;
        lock = new ReentrantLock();
    }

    public void calcCnt(){
        for (double i = slice; i<=3; i+=slice){
            cnt++;
        }
        System.out.println("Count Num : "+cnt);
    }

    public void calcArea(){
       try{
            lock.lock();
            x += slice;
            y = Math.pow(x,2);
            sum += slice * y;
            System.out.println("Current Area : " +sum);
        } catch (Exception e){
           e.printStackTrace();
        } finally {
           lock.unlock();
        }
    }

    public void run() {
        calcCnt();
        for(int i =0; i<cnt; i++){
            calcArea();
        }
        System.out.println("Final Area : "+sum);
    }
}
