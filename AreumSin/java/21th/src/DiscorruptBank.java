import java.math.BigInteger;

public class DiscorruptBank {
    public static BigInteger money;

    public DiscorruptBank(){
        money = new BigInteger("10000000000"); //천억
    }

    public void depositMoney(BigInteger deposit){ // 입금
        BigInteger m = getMoney();

        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m.add(deposit));
    }

    public void withdrawMoney(BigInteger withdraw){ // 인출
        BigInteger m = getMoney();
        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m.subtract(withdraw));
    }

    public static BigInteger getMoney() {
        return money;
    }

    public static void setMoney(BigInteger money) {
        DiscorruptBank.money = money;
    }
}
