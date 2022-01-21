public class ThreadRectangle extends ThreadCommon {


    // 사각형은 덜 쪼갤수록 정밀도가 올라가는 현상이 발생함 (float이나 double의 오차 때문에 그럼)
    // 몇개의 thread로 연산할거니?
    public ThreadRectangle (int x, int y) {
        super( x, y);
    }

    public float getSum() {
        return sum;
    }


    @Override
    public void run() {

        for (int i = xStart[localThreadId]; i <= xEnd[localThreadId]; i++) {
            sum += dx * y;
            System.out.printf("Thread ID = %d, sum = %.12f\n", localThreadId, sum);

        }

        System.out.printf("sum = %.12f\n", sum);
    }

}
