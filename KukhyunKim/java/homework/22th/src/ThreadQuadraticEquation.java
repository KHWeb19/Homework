public class ThreadQuadraticEquation extends Thread {
    final static float dx = 0.0001f;
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    public ThreadQuadraticEquation () {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("xStart = %5d, xEnd = %5d, thread ID = %d\n",
                xStart, xEnd, localThreadId);
    }

    public static void calcEachThreadTotal (int start, int end) {
        int realTotal = (int) (Math.ceil((end - start) / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        float curX = dx * xStart;

        for (int i = xStart; i <= xEnd; i++, curX += dx) {
            sum += dx * curX * curX;

            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);
        }

        System.out.printf("sum = %.12f\n", sum);
    }
}