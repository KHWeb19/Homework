//가로 2 / 0.001
//높이 2
//횟수 2000 (500*4)
//(1) 4개의 스레드로 분할해서 각 영역을 합하자
//--> 0.001*2*500*4 = 합 4
//    0~499 500~999 1000~1499 1500~1999 영역구하기
//    클래스배열에 넣어서 반복문으로 하나씩 출력하도록 만들기
//(2) 1번과 2번 문제의 중복부분을 클래스로 만들어서 상속시키자

public class Square extends Thread {
    final float TINY = 0.001f;
    final int X = 2;
    final int Y = 2;

    //static 붙이니까 Test에서 불러올 수 있음
    final static int THREAD_MAX = 4;
    static int thread_cnt = 0;
    int thread_ID;

    int total;
    int xStart, xEnd;
    float sum;

    public Square () {
        total = ((int)(Math.ceil(X/TINY)))/THREAD_MAX;
        thread_ID = thread_cnt++;
        xStart = thread_ID*total;
        xEnd = (thread_ID+1)*total-1;
        System.out.printf("thread%d: xStart= %4d, xEnd= %4d\n", thread_ID, xStart, xEnd);

        sum = 0;
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {

        for (int i=xStart; i<xEnd; i++) {
            sum += (TINY*Y);
//            System.out.printf("thread%d: %.12f\n", thread_ID, sum);
        }
        System.out.printf("thread%d: %.12f\n", thread_ID, sum);
    }
}
