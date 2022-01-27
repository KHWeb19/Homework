import java.math.BigInteger;

class AccountClient1 extends Thread{
    //
    public void run(){
        for(int i = 0; i< 50; i++) {
            DiscorruptBankSituationExample.db.depositMoney(new BigInteger("10000000000"));// 100억
            System.out.println("depositMoney(100,0000,0000): " + DiscorruptBankSituationExample.db.getMoney());
        }
    }
}

class AccountClient2 extends Thread{
    // 인출
    public void run(){
        for(int i = 0; i< 50; i++) {
            DiscorruptBankSituationExample.db.withdrawMoney(new BigInteger("10000000000"));// 100억
            System.out.println("withdrawMoney(100,0000,0000): " + DiscorruptBankSituationExample.db.getMoney());
        }

    }
}

public class DiscorruptBankSituationExample {
    public static DiscorruptBank db = new DiscorruptBank();
    // 망하는 은행 객체. -> 쓰레드로 돌리려면 쓰레드가 필요함. // 거래처와 은행으로 분리.
    // 망한 은행
    public static void main(String[] args) {

        AccountClient1 ac1 = new AccountClient1();
        AccountClient2 ac2 = new AccountClient2();

        ac1.start();
        ac2.start();

    }
}

// 정상적인 상황이라면 입출금을 같은 비율로 같은 횟수를 진행했기 때문에
// 원금이 유지되어야만 하는 상황이다.
// 그러나 결과는 보편적으로 폭망하는 상황을 인출하고 있다.
// 아주 아주 간호? 이득을 보는 경우가 있다.
// 이를 해결하기 위해 우리는 Thread에서 다루는 Critical Section과 Synchronization(동기화) 매커니즘에 대한 추가 학습이 필요하다.




