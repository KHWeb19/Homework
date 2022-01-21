public class ThreadCommon extends Thread{

    final static float dx = 0.001f;
    //protected int xStart, xEnd;
    static int threadCnt = 0;
    protected int localThreadId;

    //protected int threadNum;
    protected static int total;

    protected float sum;

    protected int x, y;

    protected static int realTotal; // 전역변수가 되었으니 검사를 한번만 할 수 있다.
    protected static int threadNum;
    protected static int totalRemain;

    protected static int[] xEnd;
    protected static int[] xStart;
    protected static int[] xTotalEnd;

    // 현재 xTotalEnd 가 Critical Section이 되어버림
    // 해결책은 2가지
    // 1. lock을 걸거나
    // 2. 배열로 만들어서 영향을 받지 않게 함 <<<--- 이게 효울적임 (스레드 갯수만큼 할당해야함.)
    // Critical Section은 여러 태스크 (스래드, 프로세스)

    // 가로 길이 2를 아주 작은값인 0.001로 나눈다.
    // 여기서 스레드를 4개 정도 사용한다면
    // 0 ~ 2를 4등분 하고 각각의 스레드에게 이것을 4등분해서 주면 된다.

    // 1. 등분 했을 경우 스레드 각각이 돌려야 하는 전체 숫자를 먼저 파악
    // 2. 이것을 베이스로 시작과 끝 값을 정하면 됨
    public ThreadCommon(int x, int y) {
        //this.threadNum = ThreadNum; // 다 thread Num을 가지고 있어야하는가가
        this.x = x;
        this.y = y;

        // 1. realTotal 값을 통해서 threadNum으로 나눴을때 몫이 얼마가 나오는지 판정한다.
        // 2. 나머지 값을 판정한다.
        // 3. 각 threadId 들에게 나머지 0이 될때까지 1개씩 나눠준다.
        calcEachThreadTotal(threadNum);
        localThreadId = threadCnt++;
        // xTotalEnd는 전역으로 현재 어디까지 갔는지 파악
        // xEnd는 실제 local 지역변수로 ㅡㅅ레드마다 각기 다르게 가지게 해야함.

        if(localThreadId == 0){
            xStart[localThreadId] = 0;
            xEnd[localThreadId] = total -1;
        }else {
            xStart[localThreadId] = xEnd[localThreadId -1] +1;
            xEnd[localThreadId] = xEnd[localThreadId -1] + total;
        }

        sum = 0;

        System.out.printf("xStart = %4d, xEnd = %4d, thread ID = %d\n", xStart[localThreadId], xEnd[localThreadId], localThreadId);

    }

    public static void calcRealTotal (int x){
        // ceil() 천정 함수: 즉 올림
        realTotal = (int) (Math.ceil(x / dx));
        System.out.println("realTotal = " + realTotal);

        totalRemain = realTotal % threadNum; // 이 친구가 여러번 돌려야할까? -> xxxx
        xEnd = new int[threadNum];
        xStart = new int[threadNum];
        xTotalEnd = new int[threadNum];

        for(int i = 0; i< threadNum; i++){
            xTotalEnd[i] = 0;
        }
    }

    public void calcEachThreadTotal (int threadNum) {
        // 현재 이 부분은 여러번 계산이 필요할 수도 있다.
        // 숫자를 완벽하게 떨어지지 않을경우

        if(totalRemain-- > 0){
            total ++;
            xTotalEnd[localThreadId] = total;
        }
        total = realTotal / threadNum;
        System.out.println("total = " + total);
    }

    public float getSum() {
        return sum;
    }


}
