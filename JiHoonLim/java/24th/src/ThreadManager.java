public class ThreadManager {
    // 4각형, y=x제곱 클래스 배열 생성
    private ThreadRectangle[] tRect;
    private ThreadQuadraticEquation[] tqe;

    // 쓰레드의 번호, 작업번호 생성
    private int threadNum;
    private int serviceCode;

    // 생성자
    public ThreadManager (int threadNum, int parameter1,
                          int parameter2, int serviceCode) {

        // 받아온 쓰레드 수와 작업번호를 저장
        this.threadNum = threadNum;
        this.serviceCode = serviceCode;

        // 작업번호에 따라 실행 메서드 분리
        checkService(threadNum);

        // 할당받은 x,y값을 가지고 이동
        serviceAlloc(parameter1, parameter2);
    }

    public void checkService (int threadNum) {
        // 작업번호를 들고와서 조건물 실행
        switch (serviceCode) {
            // 작업번호 0
            case ThreadCalculation.SQUARE:
                // 4각형 클래스 배열 쓰레드 갯수 만큼 생성
                tRect = new ThreadRectangle[threadNum];
                break;

            // 작업번호 1
            case ThreadCalculation.QUADRATIC:
                // 범위 배열 쓰레드 갯수 만큼 생성
                tqe = new ThreadQuadraticEquation[threadNum];
                break;
        }
    }

    public void serviceAlloc (int parameter1, int parameter2) {
        // x와 y 의 값을 가지고 옴
        // 작업코드 조건문 실행

        switch (serviceCode) {
            // 작업번호 0
            case ThreadCalculation.SQUARE:
                // 공통 작업의 쓰레드넘에 입력받은 쓰레드넘 입력
                ThreadCommon.threadNum = threadNum;
                // 공통 작업의 실제합에 x값 전송 (실제합값을 알기위함)
                ThreadCommon.calcRealTotal(parameter1);
                //threadCnt 0 초기화
                ThreadCommon.threadCnt = 0;

                // 쓰레드 갯수만큼 반복
                // 사각형배열 = 쓰레드 사각형(쓰레드 갯수, x, y)
                for (int i = 0; i < threadNum; i++) {
                    tRect[i] = new ThreadRectangle(threadNum, parameter1, parameter2);
                }
                break;

            // 작업번호 1
            case ThreadCalculation.QUADRATIC:
                ThreadCommon.threadNum = threadNum;
                // 실제합값은 y - x
                ThreadCommon.calcRealTotal(parameter2 - parameter1);
                ThreadCommon.threadCnt = 0;

                for (int i = 0; i < threadNum; i++) {
                    tqe[i] = new ThreadQuadraticEquation(threadNum, parameter1, parameter2);
                }
                break;
        }
    }

    // 쓰레드 활동 시작
    public void eachThreadStartWork () {
        // 작업번호에 따라 분류
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                // 0~ 쓰레드 갯수 까지 사각형클래스배열 실행 ==== 사각형클래스 run() 실행
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].start();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                // 0~ 쓰레드 갯수 까지 tqe 실행
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].start();
                }
                break;
        }
    }


    // 쓰레드 대기
    public void eachThreadWaitFinish () throws InterruptedException {
        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                //작업 번호 0 번 대기
                for (int i = 0; i < threadNum; i++) {
                    tRect[i].join();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                //작업 번호 1 번 대기
                for (int i = 0; i < threadNum; i++) {
                    tqe[i].join();
                }
                break;
        }
    }

    // 각 쓰레드의 값 합산
    public float sumEachThreadResult () {
        float sum = 0;

        switch (serviceCode) {
            case ThreadCalculation.SQUARE:
                // 각 쓰레드들의 결과 값 합산 sum에 누적
                for (int i = 0; i < threadNum; i++) {
                    sum += tRect[i].getSum();
                }
                break;

            case ThreadCalculation.QUADRATIC:
                // 각 쓰레드들의 결과 값 합산 sum에 누적
                for (int i = 0; i < threadNum; i++) {
                    sum += tqe[i].getSum();
                }
                break;
        }

        return sum;
    }

    public float calcArea () throws InterruptedException {
        // 각 쓰레드 시작
        eachThreadStartWork();
        // 대기
        eachThreadWaitFinish();
        // 최종 값 리턴
        return sumEachThreadResult();
    }
}
