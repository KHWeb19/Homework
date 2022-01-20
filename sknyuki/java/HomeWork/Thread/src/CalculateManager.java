import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CalculateManager extends Square implements Runnable {
    double[] arraywidth1;
    double[] arraywidth2;

    int range;
    double Width1;
    double Width2;
    //***critical Section 영역의 정보로 TotalSum을 설정하였습니다.***
    double TotalSum = 0;
    private Lock lock;
    //square를 상속 받음
    //lock을 쓰기위해 초기화 시켜줌
    public CalculateManager(double Height, double Width) {
        super(Height, Width);
        //가로 면적을 2로 나누어줌
        Width1 = Width / 2;
        Width2 = Width / 2;
        lock = new ReentrantLock();
    }


    public void splitwidth1() {
        range = (int) (Width1 / SplitNumber);
        arraywidth1 = new double[range];
        Arrays.fill(arraywidth1, SplitNumber);
        System.out.println(Width1 + "를" + SplitNumber + "로 나눈 갯수:" + arraywidth1.length);
    }

    public void splitwidth2() {
        range = (int) (Width2 / SplitNumber);
        arraywidth2 = new double[range];
        Arrays.fill(arraywidth2, SplitNumber);
        System.out.println(Width2 + "를" + SplitNumber + "로 나눈 갯수:" + arraywidth2.length);

    }
    //run에 넣어서 실행시키기위한 작은 사각형의 면적을 구하는 식1
    public void SumSamllSquares1() {

        lock.lock();
        for (double v : arraywidth1) {
            try {
                TotalSum += v * Height;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();

            }

        }
    }
    //run에 넣어서 실행시키기위한 작은 사각형의 면적을 구하는 식2
    public void SumSamllSquares2() {
        lock.lock();
        for (double v : arraywidth2) {
            try {
                TotalSum += v * Height;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(TotalSum);
            }
        }
    }

        @Override
        public void run () {
            SumSamllSquares1();
            SumSamllSquares2();
            System.out.println(TotalSum);
        }

    }
