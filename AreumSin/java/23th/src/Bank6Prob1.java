public class Bank6Prob1 {
    public static void main(String[] args) throws InterruptedException {

        ThreadRectangle.calcEachThreadTotal();

        ThreadRectangle[] rect = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            rect[i] = new ThreadRectangle();
        }

        for(int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            rect[i].start();
            // rect[i].join();
        }

        /*
        rect[0].start();
        rect[1].start();
        rect[2].start();
        rect[3].start();
        */

        // run으로 해서 잘 돌았는데, -> start()해서 안돌아가면 -> critical Section 에 문제 발생!

        System.out.printf("%d개의 스레드가 모든 작업을 완료했습니다.\n",ThreadRectangle.THREAD_MAX);

        float finalResult = 0;

        for(int i = 0; i<ThreadRectangle.THREAD_MAX; i++){
            finalResult += rect[i].getSum();
        }

        System.out.println("최종결과는 ?"+ finalResult);
    }
}
