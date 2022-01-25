import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class QuadraticFunction implements Runnable{
    private String threadName;
    private float xValueMin;
    private float xValueMax;
    private int x_Axis; //x축의 길이

    private int cntSquare; // x축에 몇개의 사각형을 만들지 결정
    private double yValue; // x축 값에 따라 변화하는 y값
    private float rate;  // 작은 사각형의 가로길이
    private float sum;

    private final int EXPONENT = 2; // 차수 = 2
    private Lock lock;

    //P02
    public QuadraticFunction(String threadName, float xValueMin, float xValueMax, float rate){
        this.threadName = threadName;
        this.xValueMax = xValueMax;
        this.xValueMin = xValueMin;
        x_Axis = (int)(xValueMax-xValueMin);
        this.rate = rate;
        lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            lock.lock();
            cntSquare = Math.round(x_Axis/ rate); //소수점 첫째자리 반올림해 정수로 반환
            System.out.println(threadName + " ) "+"가로가 " + rate + "인 사각형의 개수: " + cntSquare);
            calcSum(rate,xValueMin,cntSquare);
            System.out.printf("%d개의 사각형 넓이의 총합: %f\n", cntSquare, sum);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("--------------------------------------------------------------");
            lock.unlock();
        }
    }
    public void calcSum(float rate, float xValueMin, int cntSquare){
        float tmp =0.0f;
        for(int i = 0 ; i<cntSquare;i++){
            yValue = Math.pow(xValueMin,EXPONENT);   // y = x^2 그래프, 현재 x값에 해당하는 y값 구하기
            tmp = rate * (float) yValue;
            sum+=tmp;
            xValueMin+=rate;  // x값에 따른 y값을 구하기 위해 현재 x + rate
        }
    }

}
