public class ThreadQuadraticEquation extends ThreadCommon {

    // 입력 받은 x y 부모클래스에서 처리
    public ThreadQuadraticEquation(int threadNum, int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        // 현재 x = dx (0.01) * xstart[쓰레드아이디]
        float curX = dx * xStart[localThreadId];


        // xstart[쓰레드 아이디] , xend[쓰레드아이디], curx = curx + 0.01(dx)       현재 x 값을 0.01씩 이동(증가)
        for (int i = xStart[localThreadId]; i <= xEnd[localThreadId]; i++, curX += dx) {
            // 0.01씩 증가하는 dx  *  curx의 제곱(세로는 x의 제곱)
            sum += dx * curX * curX;
            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);
        }

        System.out.printf("sum = %.12f\n", sum);
    }
}
