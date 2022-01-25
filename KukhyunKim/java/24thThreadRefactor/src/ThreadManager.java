public class ThreadManager {
    private ThreadRectangle[] tRect;
    // BlaBla[] blabla;
    private ThreadQuadraticEquation[] tqe;

    private int threadNum;
    private int serviceCode;

    // 4, 2, 2, ThreadCalculation.SQUARE
    public ThreadManager (int threadNum, int parameter1,
                          int parameter2, int serviceCode) {

        this.threadNum = threadNum;
        this.serviceCode = serviceCode;

        checkService(threadNum);
        serviceAlloc(parameter1, parameter2);
    }

    public void checkService (int threadNum) {
        switch (serviceCode) {
            // serviceCode에 들어온 숫자에따라 선택하여 분배
            // ex) 0 --->> class ThreadRectangle
            //     1 --->> class ThreadQuadraticEquation

            case ThreadCalculation.SQUARE:
           // case ThreadCalculation.SQUARE (0)
                tRect = new ThreadRectangle[threadNum];
                break;

            case ThreadCalculation.QUADRATIC:
           // case ThreadCalculation.QUADRATIC (1)
                tqe = new ThreadQuadraticEquation[threadNum];
                break;
        }
    }

    public void serviceAlloc (int parameter1, int parameter2) {
        switch (serviceCode) {
            // serviceCode에 들어온 숫자에따라 선택하여 분배
            // ex) 0 --->> class ThreadRectangle
            //     1 --->> class ThreadQuadraticEquation

            case ThreadCalculation.SQUARE:
                ThreadCommon.threadNum = threadNum;
                // class ThreadCommon 에 있는 threadNum 을 ThreadManager 의 threadNum 으로 사용한다.
                ThreadCommon.calcRealTotal(parameter1);
                // class ThreadCommon 의 calcRealTotal 에 parameter1을 넣은값을 할당받는다.
                ThreadCommon.threadCnt = 0;
                // class ThreadCommon 의 threadCnt 를할당받고 초기화

                for (int i = 0; i < threadNum; i++) {
                    tRect[i] = new ThreadRectangle(threadNum, parameter1, parameter2);
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