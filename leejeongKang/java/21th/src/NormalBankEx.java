public class NormalBankEx {
    public static void main(String[] args) throws InterruptedException {
        NormalBank bank = new NormalBank();

        Thread t1 = new Thread(new Worker(bank, true, 100));
        Thread t2 = new Thread(new Worker(bank, false, 100));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("최정 결과 : "+NormalBank.getmoney());
    }
}
// extends thread vs implements runnable
//스레드가 러너블의 인터페이스 요소
// 스레드에는 내부에 상위요소들을 쓰려구
//implements runnable : run만 땡겨올때 씀
