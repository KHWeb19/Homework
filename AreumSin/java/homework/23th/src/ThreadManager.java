public class ThreadManager {
    final static float dx = 0.001f;
    final static int THREAD_MAX = 4;
    //private int xStart, xEnd;
    static  int threadCnt = 0; // 생성자가 호출될때마다 +1
    private int localThreadId;
    static int total;
    float sum;

    public ThreadManager(int xStart, int xEnd){
        localThreadId = threadCnt++;
        //int total = calcEachThreadTotal(THREAD_MAX);
        xStart = 0 + (total * localThreadId); // 0 // 500
        xEnd = total * (localThreadId +1) -1; // 499 // 999
        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread Id = %4d\n", xStart, xEnd, localThreadId);
    }

    public static void calcEachThreadTotal(int start, int end){
        int realTotal = (int) (Math.ceil((end - start) / dx));
        System.out.println("realTotal = " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = " + total);
    }
}
