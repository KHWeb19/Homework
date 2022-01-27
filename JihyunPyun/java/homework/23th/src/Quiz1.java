public class Quiz1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadRectangle.calcEachThreadTotal();

        //객체 넣을 배열 만들기
        ThreadRectangle[] tr = new ThreadRectangle[ThreadRectangle.THREAD_MAX];

        //객체 넣기
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++){
            tr[i] = new ThreadRectangle();
        }

        //쓰레드 시작
        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            tr[i].start();
        }

        for (int i = 0; i < ThreadRectangle.THREAD_MAX; i++) {
            tr[i].join();
        }

        System.out.printf("%d개 스레드 작업 완료\n", ThreadRectangle.THREAD_MAX);

        System.out.println("최종 결과는 ? " + ThreadRectangle.getSum());

    }
}
