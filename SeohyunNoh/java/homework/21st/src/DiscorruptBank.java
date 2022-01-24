import java.math.BigInteger;

public class DiscorruptBank {
    static BigInteger money;

    public DiscorruptBank () {
        money = new BigInteger("1000000000000");
    }

    public void depositMoney (BigInteger deposit) {

        // BigInteger라 money += deposit 이 안됨
        money = money.add(deposit);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void withdrawMoney (BigInteger withdraw) {
        money = money.subtract(withdraw);

        try{
            Thread.sleep(50);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public static BigInteger getMoney() {
        return money;
    }

    public static void setMoney(BigInteger money) {
        DiscorruptBank.money = money;
    }
}
