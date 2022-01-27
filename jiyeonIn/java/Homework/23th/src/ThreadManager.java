public class ThreadManager extends Thread{
    final static float dx = 0.001f;
    protected int xStart, xEnd;
    static int threadCnt = 0;
    protected int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;
    protected float sum;
    protected static int realTotal;

    public ThreadManager() {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread ID = %d\n",
                xStart, xEnd, localThreadId);
    }

    public static void calcRectangleThreadTotal (int Xvalue) {
        realTotal = (int) (Math.ceil(Xvalue / dx));
        Treadtotal();
    }

    public static void calcQuadraticThreadTotal (int start, int end) {
        realTotal = (int) (Math.ceil((end - start) / dx));
        Treadtotal();
    }

    public static void Treadtotal() {
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }

}
