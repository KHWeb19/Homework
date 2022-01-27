public class ThreadRectangle extends Thread{

    /*
    final static int X =2;
    final static int Y =2;
    final static float dx = 0.001f;
    final static int THREAD_MAX = 4;
    private int xStart, xEnd;
    static  int threadCnt = 0; // 생성자가 호출될때마다 +1
    private int localThreadId;
    static int total;
    float sum;

    // 가로 길이 2를 아주 작은 값이 0.001로 나는다.
    // 여기서 스레드를 4개 정도 사용한다면
    // 0~ 2를 4드분하고 각각의 스레드에게 이것을 4등분해서 주면 된다.

    // 1. 등분 했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    // 2. 이것을 베이스로 시작과 끝 값을 정하면 됨.

    public ThreadRectangle(){
        localThreadId = threadCnt++;
        //int total = calcEachThreadTotal(THREAD_MAX);
        xStart = 0 + (total * localThreadId); // 0 // 500
        xEnd = total * (localThreadId +1) -1; // 499 // 999
        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread Id = %4d\n", xStart, xEnd, localThreadId);
    }

    public float getSum() {
        return sum;
    }

    public static void calcEachThreadTotal(){
        // ceil() 천정 함수: 올림.
        int realTotal = (int)(Math.ceil(X/dx));
        System.out.println("realTotal = "+realTotal);

        total = realTotal / THREAD_MAX;
        System.out.println("total = "+total);
    }

     */

    /*
    @Override
    public void run() {
        // 자기 구간을 계산하도록 한다.
        float curX = xStart;

        float tmp = 0;

        for(int i = xStart; i <= xEnd; i++) {
            sum += dx * Y;
            System.out.printf("sum = %.12f , Thread id = %d\n", sum, localThreadId);

            /*
            try{
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
            }

             */
       // }

        //System.out.printf("sum = %.12f , Thread id = %d\n", sum, localThreadId);
    //}

}
