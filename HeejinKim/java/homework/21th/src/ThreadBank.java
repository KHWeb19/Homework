public class ThreadBank extends Thread {

    final int Y=2;
    final static int X = 2;
    final static float dx = 0.001f;
    private int xStart, xEnd;
    static int threadCnt = 0;
    private int ThreadId;

    final static int THREAD_MAX = 4;
    static int total;
    float sum;



    public ThreadBank(){
        ThreadId=threadCnt++;
        xStart=(total*ThreadId);                    //스레드당 첫번째 계산되어야 할 수5(2번째 스레드 500*1)
        xEnd=total*(ThreadId+1)-1;                  //스레드당 마지막 계산되는 수(2번째 스레드(500*2=1000)-1=999)
        sum=0;
    }


    public static void calcEach () {

        int realTotal = (int) (Math.ceil(X / dx));       //갯수

        total = realTotal / THREAD_MAX;                 //한 스레드당 계산 해야되는 개수
                                                        // System.out.println("total = " + total);
    }


    public float getSum() {

        return sum;
    }



    @Override
    public void run() {
       float curX=xStart;
       float tmp=0;

       for(int i=xStart;i<xEnd;i++){

           tmp = dx*Y;

           sum+=tmp;


       }
        System.out.println(sum);

    }
}
