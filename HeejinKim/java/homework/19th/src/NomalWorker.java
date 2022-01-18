public class NomalWorker implements Runnable{ //인터페이스로 쓰레드 구현

    private NormalBank bank;
    private boolean depositOrWithdraw;
    private int count;


    public NomalWorker(NormalBank bank, boolean dow, int count){
        this.bank = bank;
        depositOrWithdraw = dow;
        this.count = count;

    }


    @Override
    public void run() {//for문으로 예금 인출 하기
        for(int i=0; i<count;i++){
            if(depositOrWithdraw){
                bank.deposit();
            }
            else{
                bank.withdraw();
            }
        }
    }
}
