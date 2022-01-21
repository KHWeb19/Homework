public class Bank6play {
    public static void main(String[] args) throws InterruptedException {

        ThreadBank.calcEach();
        ThreadBank[] bank = new ThreadBank[ThreadBank.THREAD_MAX]; //배열 4개


        for(int i=0;i<ThreadBank.THREAD_MAX;i++){

            bank[i]=new ThreadBank(); //배열에 ThreadBank를 넣음

        }

        for(int i=0;i<ThreadBank.THREAD_MAX;i++){
            bank[i].start();
            bank[i].join();
        }

        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadBank.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadBank.THREAD_MAX; i++) {
            finalResult += bank[i].getSum();
        }

        System.out.println("최종 합은 ? " + finalResult);
    }
}
