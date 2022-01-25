public class ThreadRectangle extends ThreadCommon {

    public ThreadRectangle(int threadNum, int x, int y){
        super(x,y);
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
