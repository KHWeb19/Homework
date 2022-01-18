import java.math.BigInteger;

public class DiscorruptBank {
    public static BigInteger money;

    public DiscorruptBank() {
        money = new BigInteger("100000000000");
    }

    public void depositMoney(BigInteger deposit){
        money = money.add(deposit);

        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdrawMoney(BigInteger withdraw){
        money = money.subtract(withdraw);

        try{
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
