import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//(0.001 x 2)사각형을 2000번 더하면 4
//가로 0.001
//높이 2
//횟수 2000 (더할때마다 출력)
//합 4
//lock은 필요한건지 아닌지 잘모르겠습니다


public class Square implements Runnable {
    private final float TINY = 0.001f;
    private final float HEIGHT = 2;
    private static float width;
    private static float sum;
    public static int count;
    private Lock lock;

    public Square () {
        width = TINY;
        sum = 0;
        count = (int)(2/TINY);
        lock = new ReentrantLock();
    }

    public void add() {
        try {
            lock.lock();
            sum += (width * HEIGHT);
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
            System.out.println(sum);
        }
    }
}
