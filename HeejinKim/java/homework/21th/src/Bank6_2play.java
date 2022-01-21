public class Bank6_2play {
    public static void main(String[] args) throws InterruptedException {
        ThreadBank2.calcEach(0,3);
        ThreadBank2[] bank2 = new ThreadBank2[ThreadBank2.THREAD_MAX]; //배열 4개


        for(int i=0;i<ThreadBank2.THREAD_MAX;i++){

            bank2[i]=new ThreadBank2(); //배열에 ThreadBank를 넣음

        }

        for(int i=0;i<ThreadBank2.THREAD_MAX;i++){
            bank2[i].start();
            bank2[i].join();
        }

        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadBank2.THREAD_MAX);


        float finalResult = 0;

        for (int i = 0; i < ThreadBank2.THREAD_MAX; i++) {
            finalResult += bank2[i].getSum();
        }

        System.out.println(" 최종 합은 ? " + finalResult);
    }
}


