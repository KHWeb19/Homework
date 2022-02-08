public class ThreadManager extends Thread{

    // 쓰레드 4개 돌린다고 가정.
    // 0~2를 0.001로 쪼갠 것이 4구간

    final static float DX = 0.001f;
    static int xStart, xEnd;
    private int threadCnt = 0;
    static int threadId;
    final static int THREAD_MAX = 4;

    static int split;
    static int sum;
    static int total;

    public ThreadManager () {

        threadId = threadCnt++;

        xStart = 0 + split * threadId;
        xEnd = split * (threadId + 1) - 1;

        sum = 0;
    }

    public static void calRectangleX(int Xv){
        total = (int)(Math.ceil(Xv / DX));
        splitArea();
    }

    public void calGFunctionX (int start, int end){
        total = (int)(Math.ceil((end-start) / DX));
        splitArea();
    }


    public static void splitArea (){
        split = total / THREAD_MAX ;
        System.out.println("split = " + split);
    }

    public float getSum() {return sum;}

}
