import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank {
    private static BigInteger money;
    private Lock lock;

    public NormalBank(){
        money = new BigInteger("10000000000");

        // 제어권을 잠그기 위함
        lock = new ReentrantLock();
    }

    public void deposit(){
        try{
            // 제어권 잠금
            lock.lock();
            money = money.add(new BigInteger("1000000000"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //제어권 해제
            lock.unlock();
        }
    }


    public void withdraw(){
        try{
            // 제어권 잠금
            lock.lock();
            money = money.subtract(new BigInteger("1000000000"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //제어권 해제
            lock.unlock();
        }
    }

    public static BigInteger getMoney(){
        return money;
    }
}
