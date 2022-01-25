public class Bank6Prob1 {
    public static void main(String[] args) throws InterruptedException {

        ThreadRectangle.calcEachThread();

        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            rect[i] = new ThreadRectangle();
        }

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            rect[i].start();
            rect[i].join();
        }


        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadRectangle.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);
    }
}
