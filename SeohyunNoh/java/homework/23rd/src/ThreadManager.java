public class ThreadManager {
    // 여기서 스레드의 기능들을 몰아넣고 쓰기

    final int Y = 2;
    final static int X = 2;
    final static float dx = 0.001f;
    private int xStart, xEnd;

    static int threadId = 0; // 스레드를 하나씩 증가시켜주기 위함
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    public ThreadManager () {
        localThreadId = threadId++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1; // 처음에 localThreadId=0이니까 +1해주고 total(500) 곱해주고 -1 (왜냐면 0~499의 500개니까)

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %5d, threadId =%d\n",
                xStart, xEnd, threadId);
    }

    // 언제든지 얘를 호출할 수 있게 static
    public static void calcEachThreadTotal() {
        // ceil() : 올림
        // X/dx의 값이 1999.9999라서 이를 올림으로 하고 int형변환
        int realTotal = (int) (Math.ceil(X / dx));
        System.out.println("realTotal : " + realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total : " + total);
    }
}
