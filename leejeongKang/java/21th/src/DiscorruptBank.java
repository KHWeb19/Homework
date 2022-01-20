import java.math.BigInteger;
import java.util.function.BiConsumer;

public class DiscorruptBank {

    static BigInteger money;
    public DiscorruptBank (){
        money = new BigInteger("100000000000");
    }

    public void depositMoney (BigInteger deposit){
        money.add(deposit);

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void withdrawMoney (BigInteger withdraw){
        money.subtract(withdraw);
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
