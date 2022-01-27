public class ThreadRectangle extends Thread {
    final int Y = 2;
    final static int X = 2;
    final static float dx = 0.001f;
    private int xStart, xEnd;

    static int threadId = 0; // 스레드를 하나씩 증가시켜주기 위함
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    // 가로길이 2를 아주 작은 값인 0.001로 나눈다.
    // 스레드를 4개 사용하여
    // 0~2를 4등분하고 각각의 스레드에게 이것을 주면 된다.

    // 1. 등분했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    // 2. 이것을 베이스로 시작과 끝 값을 정하면 됨
    public ThreadRectangle () {
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

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        // 자신의 구간을 계산
        float curX = xStart;

        for(int i = xStart ; i <= xEnd ; i++){
            sum += dx * Y;
        }

        System.out.printf("sum = %f\n", sum);
    }
}
