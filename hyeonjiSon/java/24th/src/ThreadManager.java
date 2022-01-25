public class ThreadManager {
    //private 배열 생성 Rectangle, 이차방정식
    private ThreadRectangle[] tRect;
    // BlaBla[] blabla;
    private ThreadQuadraticEquation[] tqe;

    private int threadNum;
    private int serviceCode;

    //스레드 매니저의 인수가 매개변수를 인식할 수 있도록 한다.
    // 4, 2, 2, ThreadCalculation.SQUARE
    public ThreadManager (int threadNum, int parameter1,
                          int parameter2, int serviceCode) {

        this.threadNum = threadNum;
        this.serviceCode = serviceCode;

        checkService(threadNum); //this threadNum으로 인식된 숫자를 체크 서비스 매개변수로 입력하여 실행
        serviceAlloc(parameter1, parameter2); //parameter1, 2 값을 매개변수로 serviceAlloc을 실행
    }

    //ThreadManager내에서 확인된 thread Num 매개변수를 인수로 받으며 작동
    public void checkService (int threadNum) {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE: //ThreadCalculation의 전역변수 SQUARE의 값 = 0;
                tRect = new ThreadRectangle[threadNum]; //배열 선언(threadNum갯수만큼 생성됨)
                break;

            case ThreadCalculation.QUADRATIC:
                tqe = new ThreadQuadraticEquation[threadNum];  //배열 선언(threadNum갯수만큼 생성됨)
                break;
        }
    }

    public void serviceAlloc (int parameter1, int parameter2) { //2, 2
        switch (serviceCode) { //ThreadCalculaton.SQUARE
            case ThreadCalculation.SQUARE:
                ThreadCommon.threadNum = threadNum; //Common의 threadNum수를 main에서 받은 threadNum 수로 바꿔줌
                ThreadCommon.calcRealTotal(parameter1); //int x에 2를 넣고 calcRealTotal실행
                ThreadCommon.threadCnt = 0;

                for (int i = 0; i < threadNum; i++) {
                    tRect[i] = new ThreadRectangle(threadNum, parameter1, parameter2);
                    //ThreadRectangle의 내용은 public ThreadCommon을 상속받음
                }
                break;

            case ThreadCalculation.QUADRATIC:
                ThreadCommon.threadNum = threadNum;
                ThreadCommon.calcRealTotal(parameter2 - parameter1);
                ThreadCommon.threadCnt = 0;

                for (int i = 0; i < threadNum; i++) {
                    tqe[i] = new ThreadQuadraticEquation(threadNum, parameter1, parameter2);
                }
                break;
        }
    }

    public void eachThreadStartWork () {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].start();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].start();
                }
                break;
        }
    }

    public void eachThreadWaitFinish () throws InterruptedException {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].join();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].join();
                }
                break;
        }
    }

    public float sumEachThreadResult () {
        float sum = 0;

        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                for (int i = 0; i < threadNum; i++) {
                    sum += tRect[i].getSum();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                for (int i = 0; i < threadNum; i++) {
                    sum += tqe[i].getSum();
                }
                break;
        }

        return sum;
    }

    public float calcArea () throws InterruptedException {
        eachThreadStartWork();
        eachThreadWaitFinish();
        return sumEachThreadResult();
    }
}
