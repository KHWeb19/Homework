import java.math.BigInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NormalBank { //생성자 호출, 입금 메서드 ,출금 메서드 (락으로 잠금)넣기
    // worker에는 쓰레드 생성 .. for문을 돌면서 입금과 출금을 해줌 .
    // 실행하는 메서드 도 있음

    private static BigInteger money;
    private Lock lock;

    public NormalBank(){
        money=new BigInteger("100000");
        lock =new ReentrantLock();

    }

    public void deposit() { //입금 메서드
        try {
            lock.lock();
            money = money.add(new BigInteger("1000"));
            System.out.println("현재 금액: " + money);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

        public void withdraw() { //출금 메서드
            try{
                lock.lock();
                money=money.subtract(new BigInteger("1000"));
                System.out.println("현재 금액: " + money);
            } catch (Exception e){
                e.printStackTrace();
            }

            finally {
                lock.unlock();
            }


        }


}
