public class ThreadRectangle extends ThreadManager {
    final int Y = 2;
    final static int X = 2;


    public ThreadRectangle () {
        super();
        sum=0;
    }

    public static void calcEachThread ( ) {
        ThreadManager.calcRectangleThreadTotal (X);
    }

    public float getSum() {
        return sum;
    }

    @Override
    public void run() {
        float tmp = 0;

        for (int i = xStart; i <= xEnd; i++) {
            tmp = dx * Y;
            //System.out.printf("tmp = %.12f\n", tmp);
            sum += tmp;
            //System.out.printf("sum = %.12f\n", sum);
        }

        //System.out.printf("tmp * 500 = %.12f\n", tmp * 500);
        System.out.printf("sum = %.12f\n", sum);
    }
}
