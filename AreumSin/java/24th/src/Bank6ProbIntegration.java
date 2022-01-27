public class Bank6ProbIntegration {
    public static void main(String[] args) throws InterruptedException {
        //ThreadRectangle rect = new ThreadRectangle(4, 2, 2);
        // 사용자가 Rectangle을 몰라도 할 수 있도록,
        // 몇 개의 스레드로 처리할지, x, y 정보

        // 근데 2번은? 서비스 코드 (숫자)가 필요함.
        ThreadManager tm1 = new ThreadManager(6, 2, 2, ThreadCalculation.SQUARE);
        ThreadManager tm2 = new ThreadManager(4, 0, 3, ThreadCalculation.QUADRATIC);

        System.out.println("계산 결과 = "+ tm1.calcArea());
        System.out.println("계산 결과 = "+ tm2.calcArea());

        /*
        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.threadNum];

        // 스레드 준비
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            rect[i] = new ThreadRectangle();
        }

        // 스레드 구동
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++)
        {
            // run()으로 구동되면 Thread가 관장하는 제어권에서 제어되지 않음
            //rect[i].run();
            // start()로 구동하면 Thread 상에서 Context Switching을 통한 경쟁이 활성화됨
            rect[i].start();
        }

        /*
        rect[0].start();
        rect[1].start();
        rect[2].start();
        rect[3].start();
         */

        /*
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            rect[i].join();
        }
        // test 구동 (컴퓨터 세계의 오차의 모순을 확인)
        //rect[0].run();
        System.out.printf("%d개의 스레드가 모든 작업을 완료하였습니다.", ThreadRectangle.THREAD_MAX);

        float finalResult = 0;

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);

         */
    }
}
