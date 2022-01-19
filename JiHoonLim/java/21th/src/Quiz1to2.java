import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Quiz1to2 extends Thread {
    final double DIVISION = 0.01 ;

    private int width;
    private int column;
    private int quizNum;

    private int widthCnt;

    private double sumarea;

    private double [] arrwidth;
    private double [] area;

    private Lock lock;

    // 가로 세로 받아옴
    public Quiz1to2(int width, int column, int quizNum){
        this.width = width;
        this.column = column;
        this. quizNum = quizNum;

        lock = new ReentrantLock();
    }

    public void quizChoice(){
        if (quizNum == 1){
            calcQuiz1();
        }else if (quizNum == 2){
            calcQuiz2();
        }
    }

    // 문제 1, 2번 동일 사용용
    public void divisionWidth(){
        // 가로를 나눔 --> 0.01 로 나누면 가로의 갯수가 나옴
        widthCnt =  (int) (width / DIVISION);

        // 가로 배열 생성성
        arrwidth = new double[widthCnt];

        // 200개의 가로값 배열에 0.01 넣는다
        for (int i = 0; i < widthCnt; i ++){
            arrwidth[i] = DIVISION;
        }
    }

    public void calcQuiz1(){
        sumarea = 0;
        calcSameOp();
    }

    public void calcQuiz2(){
        // 사각형면적이 9에 근접인데 x의 값에 따라 변하게 한다 --> 세로=9 가되야한다
        sumarea = 0;
        //세로값 제곱으로 초기화
        column = column * column;

        calcSameOp();
    }

    public void calcSameOp(){
        //면적 배열
        area = new double[widthCnt];

        // 면적 배열에 면적값을 저장
        for (int i = 0 ; i < widthCnt; i ++) {
            area[i] = column * arrwidth[i];
        }

        //면적값 연산
        try{
            lock.lock();
            sumarea = 0;

            for (int i = 0 ; i < widthCnt; i ++){
                sumarea += area[i];
                System.out.println(sumarea);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println(+ quizNum + "번 최종결과 " + sumarea);
            lock.unlock();
        }
    }


    public void run(){
        divisionWidth();
        quizChoice();
    }
}
