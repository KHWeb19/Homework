public class ThreadCommon extends Thread {

    final static float dx = 0.001f;

    protected int localThreadId;
    static int threadCnt = 0;

    protected int total;

    protected int x, y;

    protected float sum;

    protected static int[] xStart;
    protected static int[] xEnd;

    protected static int realTotal;
    protected static int threadNum;
    protected static int totalRemain;

    public ThreadCommon (int x, int y) {
        this.x = x;
        this.y = y;

        calcEachThreadTotal();

        localThreadId = threadCnt++;

        // total    334     334     333     333
        // xStart   0       334     668    1001
        // xEnd     333     667    1000    1333
        if(localThreadId == 0){
            xStart[localThreadId] = 0;
            xEnd[localThreadId] = total -1;
        }else {
            xStart[localThreadId] = xEnd[localThreadId - 1] + 1;
            xEnd[localThreadId] = xEnd[localThreadId - 1] + total;
        }
        sum = 0;

        System.out.printf("xStart = %5d, xEnd = %5d, thread ID = %d\n",
                xStart[localThreadId], xEnd[localThreadId], localThreadId);
    }

    public static void calcRealTotal (int x) {
        // ceil() 천정 함수: 즉 올림
        realTotal = (int) (Math.ceil(x / dx)); // 이거 이거 확인해보기
        System.out.println("realTotal = " + realTotal);

        totalRemain = realTotal % threadNum;

        xEnd = new int[threadNum];
        xStart = new int[threadNum];

        for(int i = 0; i < threadNum; i++){
            xStart[i] = 0;
            xEnd[i] = 0;
        }

    }

    public void calcEachThreadTotal(){
        total = realTotal/threadNum;

        if(totalRemain-- > 0){
            total++;
        }

        System.out.println("전체 : "+total);
    }

    public float getSum() {
        return sum;
    }
}
