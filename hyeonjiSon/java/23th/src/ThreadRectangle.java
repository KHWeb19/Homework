import java.sql.SQLOutput;

public class ThreadRectangle extends Thread {
    final int Y = 2;
    final static int X = 2;
    // 사각형은 덜 쪼갤수록 정밀도가 올라가는 현상이 발생함 (float이나 double의 오차 때문에 그럼)
    final static float dx = 0.001f;
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int localThreadId;

    final static int THREAD_MAX = 4;
    static int total;

    float sum;

    //가로 길이 2를 아주 작은 값인 0.001로 나눈다.
    //여기서 스레드를 4개 정도 사용한다면 0~2를 4등분 하고 각각의 스레드에게 이것을 4등분해서 주면 된다.

    //1. 등분 했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    //2. 이것을 베이스로 시작과 끝 값을 정하면 됨
    public ThreadRectangle() {
        localThreadId = threadCnt++;
        xStart = 0 + total * localThreadId;
        xEnd = total * (localThreadId + 1) - 1;

        sum = 0;

        System.out.printf("'Xstart = %4d, xEnd = %4d, thread ID = %4d, thread Cnt = %4d\n",
                xStart, xEnd, localThreadId, threadCnt);
    }

    public static void calcEachThreadTotal() {
        //ceil() 천정 함수: 즉 올림
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
        //자기 구간을 계산하도록 한다.

        float curX = xStart;
        float tmp = 0;

        for (int i = xStart; i <= xEnd; i++) {
            tmp = dx * Y;
            //System.out.printf("tmp = %.12f\n", tmp);
            sum += tmp;
            //System.out.printf("sum = %.12f\n", sum);
        }

        //System.out.printf("tmp * 500 = %.12f\n", tmp * 500);
        System.out.printf("sum = %.12f\n", sum);
    }
}
