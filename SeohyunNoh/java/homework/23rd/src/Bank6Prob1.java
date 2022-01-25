public class Bank6Prob1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadRectangle.calcEachThreadTotal();

        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        for(int i = 0 ; i < ThreadRectangle.THREAD_MAX ; i++){
            rect[i] = new ThreadRectangle();
        }

        for(int i = 0 ; i < ThreadRectangle.THREAD_MAX ; i++){
            rect[i].run();
            rect[i].join(); // 4개의 스레드가 전부 작업을 완료할 때까지 main프로세스 잡아둠
        }

        float fianlResult = 0;

        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            fianlResult += rect[i].getSum();
        }

        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다. 최종결과는? %f\n " , ThreadRectangle.THREAD_MAX, fianlResult);
    }

}
