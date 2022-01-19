import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Quadrilateral implements Runnable{

    private int width; // 가로
    private int height; // 높이
    private float standard; // 가로를 몇개로 쪼갤지 정하는 기준
    private float standardArea; // 사각형의 넓이
    private float standardMin;  // 계산된 값과 비교할 최솟값
    private float standardMax;  // 계산된 값과 비교할 최댓값
    private int cntSquare;  // 쪼개진 작은 사각형들의 갯수
    private float sum; // 작은 사각형들의 넓이를 더할 sum
    private boolean CloseToStandardArea; //계산값이 기준넓이의 최소치와 최대치 사이에 들어가는지 판별
    private Lock lock;
    private String threadName;

    // P01
    public Quadrilateral(String threadName, int width, int height, float standard){
        this.width = width;
        this.height = height;
        this.standard = standard;
        this.threadName = threadName;
        standardArea = (float)(width * height);
        System.out.printf(" %s )사각형의 가로 : %d, 높이: %d, 넓이: %f\n",threadName,width,height,standardArea);
        standardMin = standardArea - 0.25f;
        standardMax = standardArea + 0.25f;
        System.out.println("--------------------------------------------------------------");
        lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            lock.lock();
            cntSquare = (int) (width / standard);
            //System.out.println("가로가 " + standard + "인 사각형의 개수: " + cntSquare);
            calcSum(standard, height, cntSquare);
            //System.out.printf("%d개의 사각형 넓이의 총합: %f\n", cntSquare, sum);
            isCloseToStandardArea(sum);
            if (CloseToStandardArea) {
                System.out.printf(" %s ) 계산된 넓이인 %f는 기준 넓이인 %f에 근접합니다\n", threadName,sum, standardArea);
                System.out.println("======================================================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void calcSum(float standard, int height, int cntSquare){
        float tmp =0.0f;
        for(int i = 0 ; i<cntSquare;i++){
            tmp = standard * (float) height;
            sum+=tmp;
            //System.out.printf("tmp : %f,sum: %f\n",tmp,sum);
        }
    }

    public boolean isCloseToStandardArea(float sum){ //계산값이 기준넓이의 최소치와 최대치 사이에 들어가는지 판별한다.
        if((standardMin<=sum)||(standardMax>=sum)){
            CloseToStandardArea = true;
        }
        else {
            CloseToStandardArea = false;
        }
        return CloseToStandardArea;
    }
}
