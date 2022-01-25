public class Rectangle extends ThreadManager {

    final static int X = 2;
    final int Y = 2;

    public Rectangle() {

        super();
    }

    public static void calRectangle(){
        ThreadManager.calRectangleX(X);
    }
    @Override
    public void run() {
        float tmp = 0;

        for (int i = xStart; i <=xEnd; i++){
            tmp = DX * Y;
            sum += tmp;
            System.out.printf("Thread ID = %d, sum = %.12f\n", threadId, sum);
        }
    }
}

