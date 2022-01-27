import java.math.BigInteger;

class AccountClient1 extends Thread {
    public void run() {
        for (int i = 0; i < 100 ; i++){
            DiscorruptBankSituationExample.db.depositMoney(new BigInteger("100000000000"));
            System.out.println("depositMoney(100,000,000,000)" + DiscorruptBankSituationExample.db.money);
        }
    }
}

class AccountClient2 extends Thread {
    public void run() {
        for (int i = 0; i < 100 ;i++){
            DiscorruptBankSituationExample.db.withdrawMoney(new BigInteger("100000000000"));
            System.out.println("withdrawMoney(100,000,000,000)" + DiscorruptBankSituationExample.db.money);
        }
    }
}

public class DiscorruptBankSituationExample {
    // 전역으로 만들어서 이 db를 어디서든 쓸 수 있게
    public static DiscorruptBank db = new DiscorruptBank();

    public static void main(String[] args) {
        AccountClient1 ac1 = new AccountClient1();
        AccountClient2 ac2 = new AccountClient2();

        ac1.start();
        ac2.start();
    }
}
