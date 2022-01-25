public class NomalBankPlay {
    public static void main(String[] args) throws InterruptedException {
    NormalBank bank = new NormalBank();

    Thread t1 =new Thread(new NomalWorker(bank,true,100));
    Thread t2 =new Thread(new NomalWorker(bank,false,100));
    t1.start();
    t2.start();

    t1.join();
    t2.join();


        System.out.println("최종결과는  "+NormalBank.getMoney());


    }
}
