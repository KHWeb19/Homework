public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadQuadraticEquation.calcEachThreadTotal(0, 3);

        ThreadQuadraticEquation[] rect = new ThreadQuadraticEquation[ThreadQuadraticEquation.THREAD_MAX];

        for (int i = 0; i < ThreadQuadraticEquation.THREAD_MAX; i++)
        {
            rect[i] = new ThreadQuadraticEquation();
        }

        for (int i = 0; i < ThreadQuadraticEquation.THREAD_MAX; i++)
        {
            rect[i].start();
        }

        for (int i = 0; i < ThreadQuadraticEquation.THREAD_MAX; i++) {
            rect[i].join();
        }

        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadQuadraticEquation.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);
    }
}