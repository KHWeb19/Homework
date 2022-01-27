public class SquareExample {
    public static void main(String[] args) throws InterruptedException {
        Square[] rect = new Square[Square.THREAD_MAX];
        for (int i=0; i<Square.THREAD_MAX; i++) {
            rect[i] = new Square();
        }
        for (int i=0; i<Square.THREAD_MAX; i++) {
            rect[i].start();
        }
        for (int i = 0; i < Square.THREAD_MAX; i++) {
            rect[i].join();
        }

        float finalResult = 0;
        for (int i = 0; i < Square.THREAD_MAX; i++) {
            finalResult += rect[i].getSum();
        }

        System.out.println("최종 결과는 ? " + finalResult);
    }
}
