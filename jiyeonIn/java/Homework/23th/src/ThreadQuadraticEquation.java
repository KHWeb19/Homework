public class ThreadQuadraticEquation extends ThreadManager {

    public ThreadQuadraticEquation () {
        super();
    }

    public static void calcEachThreadTotal (int start, int end) {
        ThreadManager.calcQuadraticThreadTotal(start, end);
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        float curX = dx * xStart;
        for (int i = xStart; i <= xEnd; i++, curX += dx) {
            sum += dx * curX * curX;
        }
        System.out.printf("sum = %.12f\n", sum);
    }
}
