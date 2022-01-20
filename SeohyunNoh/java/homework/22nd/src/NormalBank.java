import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank {
    private static BigInteger money;
    private Lock lock;

    public NormalBank(){
        money = new BigInteger("10000000000");
        lock = new ReentrantLock();
    }

    public void deposit(){
        try{
            lock.lock();
            money = money.add(new BigInteger("10000000000"));
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(){
        try{
            lock.lock();
            money = money.subtract(new BigInteger("10000000000"));
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static BigInteger getMoney() {
        return money;
    }
}
