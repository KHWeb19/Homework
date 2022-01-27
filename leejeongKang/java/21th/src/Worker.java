import java.math.BigInteger;

public class Worker implements Runnable {
    private NormalBank bank;

    private boolean DepositOrWithdraw;

    private int count;

    public Worker (NormalBank bank, boolean dow, int count){
        this.bank = bank;
        DepositOrWithdraw = dow;
        this.count = count;
    }

    public void run(){
        for(int i = 0; i<count; i++){
            if(DepositOrWithdraw){
                bank.deposit();
            }
            else{
                bank.withdraw();
            }
        }
    }
}
