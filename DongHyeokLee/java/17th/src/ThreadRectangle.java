public class ThreadRectangle extends ThreadManager implements Runnable {
    final int Y = 2;
    final static int X = 2;
    // 사각형은 덜 쪼갤수록 정밀도가 올라가는 현상이 발생함 (float이나 double의 오차 때문에 그럼)



    public static void calcEachThreadTotal () {
        // ceil() 천정 함수: 즉 올림
        int realTotal = (int) (Math.ceil(X / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {

        float curX = xStart;
        float tmp = 0;
        float cnt = 1;

        for (int i = xStart; i <= xEnd; i++) {
            tmp = dx * Y;
            sum += tmp;
            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);

        }

        System.out.printf("sum = %.12f\n", sum);
    }

}
