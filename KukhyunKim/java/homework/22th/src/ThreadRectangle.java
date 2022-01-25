public class ThreadRectangle extends Thread {
    final int Y = 2;
    final static int X = 2;
    final static float dx = 0.001f;
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;


    public ThreadRectangle () {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread ID = %d\n",
                xStart, xEnd, localThreadId);
    }

    public static void calcEachThreadTotal () {
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