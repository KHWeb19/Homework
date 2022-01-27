import java.util.concurrent.locks.Lock;

public class Square implements Runnable {

    private int width;
    private int height;
    private float area;

    private Lock lock;

    private final float BIAS = 0.001f;


    public Square(int num) {

        width = num;
        height = num;

    }

    @Override
    public void run() {

        try {
            float tmp;
            width /= BIAS;

            float[] squareArr = new float[width];

            for (int i = 0; i < squareArr.length; i++) {

                squareArr[i] = 0.001f;
                tmp = squareArr[i] * height;
                area += tmp;

            }

            System.out.println("면적 : " + area);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
