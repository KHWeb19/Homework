public class NormalBankSituationExample {
    public static void main(String[] args) throws InterruptedException {
        NormalBank bank = new NormalBank();

        // 예금
        Thread t1 = new Thread(new Worker(bank, true, 100));
        // 출금
        Thread t2 = new Thread(new Worker(bank, false, 100));

        t1.start();
        t2.start();


        // join : main 프로세스는 Thread 가 끝날 때까지 대기
        t1.join();
        t2.join();

        // 최종 결과 확인
        System.out.println("최종 결과는 : " +NormalBank.getMoney());

    }
}
