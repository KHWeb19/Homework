public class NormalBankSituationExample {
    public static void main(String[] args) throws InterruptedException {
        NormalBank bank = new NormalBank();

        // Worker(예금 처리 종헙원 뽑아서 100만번 일 시킴)
        Thread t1 = new Thread(new Worker(bank, true, 1000000)); // 예금만 담당

        // Worker(출금 처리 종헙원 뽑아서 100만번 일 시킴)
        Thread t2 = new Thread(new Worker(bank, false, 1000000)); // 출금만 담당

        t1.start();
        t2.start();

        // join을 하게되면 main 프로세스는 Thread가 끝날때까지 대기하게 된다.
        t1.join();
        t2.join();

        // 아래서 최종 결과를 확인할 것이므로 대기를 해야함.
        // 화면에 출력하는 i/o는 속도가 느리기 때문에
        // 많은 양을 화면에 출력하면 동작 속도가 현격하게 떨어진다.
        // 아래 최종 결과만 보는 경우엔 굉장히 빠르게 동작하지만
        // 각 스레드의 동작들을 출력한다면 속도가 떨어진다.

        // 현재 100만법 정도의 루프에서 i/o 추가가 상당히 성능 저하를 유박하고 있다.
        // i/o를 제거 하면 여전히 빠르게 돌아간다.
        System.out.println("최종 결과는: " + bank.getMoney());
    }
}
