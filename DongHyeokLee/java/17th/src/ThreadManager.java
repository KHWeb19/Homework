public class ThreadManager extends Thread {

    final static float dx = 0.001f;
    final static int THREAD_MAX = 4;

    static int total;
    int xStart, xEnd;
    int localThreadId;
    int threadCnt = 0;
    float sum;

    public ThreadManager () {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("xStart = %5d, xEnd = %5d, thread ID = %d\n",
                xStart, xEnd, localThreadId);
    }
}
