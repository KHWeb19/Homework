import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank{

    private BigInteger money;
    private Lock lock;

    public NormalBank(){
        money = new BigInteger("10000000000");
        // 아래 친구가 베리어(방어막)
        lock = new ReentrantLock();
    }

    public void deposit(){
        try {
            // 베리어 활성화
            lock.lock();
            money = money.add(new BigInteger("100000000")); // 방어해야할 대상. // c
            System.out.println("현재 금액: "+money);
        }catch (Exception e){
            e.printStackTrace();
        }finally { // finally는 catch에 걸리던 별 이상없이 없던 무조건 실행되는 루틴 (맨 마지막에 해야함)
            lock.unlock();
        }
    }

    public void withdraw(){
        try {
            // 베리어 활성화
            lock.lock();
            money = money.subtract(new BigInteger("100000000")); // 방어해야할 대상.
            System.out.println("현재 금액: "+money);
        }catch (Exception e){
            e.printStackTrace();
        }finally { // finally는 catch에 걸리던 별 이상없이 없던 무조건 실행되는 루틴 (맨 마지막에 해야함)
            lock.unlock();
        }
    }

    public BigInteger getMoney() {
        return money;
    }
}
