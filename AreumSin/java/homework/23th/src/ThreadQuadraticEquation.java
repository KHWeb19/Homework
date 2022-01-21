public class ThreadQuadraticEquation extends ThreadManager implements Runnable {// 2차방적식
 /*
    final static float dx = 0.000001f;
    final static int THREAD_MAX = 4;
    private int xStart, xEnd;
    static  int threadCnt = 0; // 생성자가 호출될때마다 +1
    private int localThreadId;
    static int total;
    float sum;

    public ThreadQuadraticEquation(){
        localThreadId = threadCnt++;
        //int total = calcEachThreadTotal(THREAD_MAX);
        xStart = 0 + (total * localThreadId); // 0 // 500
        xEnd = total * (localThreadId +1) -1; // 499 // 999

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread Id = %4d\n", xStart, xEnd, localThreadId);

    }

    public static void calcEachThreadTotal(int start, int end){
        // ceil() 천정 함수: 올림.
        int realTotal = (int)(Math.ceil((end - start)/dx));
        System.out.println("realTotal = "+realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = "+total);
    }

    public float getSum() {
        return sum;
    }

        */
    float sum;
    private int xStart, xEnd;
    final static float dx = 0.000001f;
    private int localThreadId;

    public ThreadQuadraticEquation(){
        super(0, 3);
    }

    @Override
    public void run() {
        // 자기 구간을 계산하도록 한다.
        float curX = dx * xStart;

        // y = x^2  높이값 curX * curX
        // 사각형의 넓이 dx * y = dx * curX * curX
        for(int i = xStart; i <= xEnd; i++, curX += dx) {
            sum += dx * curX * curX;
        }

        System.out.printf("sum = %.12f , Thread id = %d\n", sum, localThreadId);
    }

    public float getSum() {
        return sum;
    }
}
