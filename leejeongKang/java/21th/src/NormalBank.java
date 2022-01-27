import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank {
    private static BigInteger money;
    private Lock lock;
    //스레드에서는 크리티컬 섹션을 분별하는 것이 중요하다.
    public NormalBank() {
        money = new BigInteger("1000000000");
        lock = new ReentrantLock(); //방어막
    }

    public void deposit() {
        try {
            lock.lock(); //배리어 활성화
            money = money.add(new BigInteger("1000000000")); //money가 critical section이라 방어막 쳐줌
            System.out.println("현재 금액 +:"+money);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 베리어 해제
        }
    }

    public void withdraw() {
        try {
            lock.lock(); //배리어 활성화
            money = money.subtract(new BigInteger("100000000"));
            System.out.println("현재 금액 -:"+money);
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //finally는 catch에 걸리던 별 이상이 없던 무조건 실행하는 루틴(맨 마지막)
            lock.unlock();
        }
    }

    public static BigInteger getmoney(){
        return money;
    }

    }
