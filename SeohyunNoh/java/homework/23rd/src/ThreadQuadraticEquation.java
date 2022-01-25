public class ThreadQuadraticEquation extends Thread {

    final static float dx = 0.001f;
    private int xStart, xEnd;

    static int threadId = 0;
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    public ThreadQuadraticEquation(){
        localThreadId = threadId++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1; // 처음에 localThreadId=0이니까 +1해주고 total(500) 곱해주고 -1 (왜냐면 0~499의 500개니까)

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %5d, threadId =%d\n",
                xStart, xEnd, threadId);
    }

    public static void calcEachThreadTotal(int start, int end) {
        int realTotal = (int) (Math.ceil((end - start) / dx));
        System.out.println("realTotal : " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total : " + total);
    }

}
