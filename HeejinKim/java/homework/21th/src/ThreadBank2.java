public class ThreadBank2 extends Thread {

    final static float dx = 0.001f;
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int ThreadId;

    final static int THREAD_MAX = 4;
    static int total;
    float sum;

    public ThreadBank2() {

        ThreadId = threadCnt++;

        xStart = (total * ThreadId);

        xEnd = total * (ThreadId + 1) - 1;
        sum = 0;
    }

    public static void calcEach(int start, int end) {

        int realTotal = (int) (Math.ceil((end - start) / dx)); //확장성을 생각해서 x=3이라고 안해줌
        total = realTotal / THREAD_MAX;                        //계산식할 때 괄호 잘하기

    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {

        float curX = dx * xStart;


        for (int i = xStart; i <= xEnd; i++, curX += dx) { //이렇게도 사용가능

            sum += dx * curX * curX;
        }

        System.out.println(sum);

    }
}


