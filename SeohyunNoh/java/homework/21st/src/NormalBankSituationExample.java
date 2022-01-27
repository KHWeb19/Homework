public class NormalBankSituationExample {
    public static void main(String[] args) throws InterruptedException {
        NormalBank bank = new NormalBank();

        Thread t1 = new Thread(new Worker(bank, true, 100));
        Thread t2 = new Thread(new Worker(bank, false, 100));

        t1.start();
        t2.start();

        // main프로세스는 Thread가 끝날 때까지 기다린다
        t1.join();
        t2.join();

        System.out.println("최종 결과는 : " + NormalBank.getMoney());
    }
}
