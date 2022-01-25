import java.math.BigInteger;
class AccountClient1 extends Thread {
    public void run() {
        DiscorruptBankSituationEx.db.depositMoney(new BigInteger("10,000,000"));
        System.out.println("depositMoney 10,000,000" + DiscorruptBankSituationEx.db.money);
    }
}

class AccountClient2 extends Thread{
    public void run(){
        DiscorruptBankSituationEx.db.depositMoney(new BigInteger("10,000,000"));
        System.out.println("withdrawMoney 10,000,000" + DiscorruptBankSituationEx.db.money);
    }
}

public class DiscorruptBankSituationEx {
    public static DiscorruptBank db = new DiscorruptBank();
    public static void main(String[] args) {
        AccountClient1 ac1 = new AccountClient1();
        AccountClient2 ac2 = new AccountClient2();

        ac1.start();
        ac2.start();
    }
}
