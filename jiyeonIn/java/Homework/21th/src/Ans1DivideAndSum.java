import java.util.Arrays;

public class Ans1DivideAndSum implements Runnable {
    static int vertical;
    static int count;
    static float width;
    private float widthStandard = 0.001f;
    final static int BIAS = 1000;
    private float widthArr[];

    public Ans1DivideAndSum(int vertical, float width) {
        this.vertical = vertical;
        this.width = width;
        count = (int) (width / widthStandard) + 1;
        widthArr = new float[count];
    }

    public void seperateWidth(){
        for (int i = 0; i < count; i++) {
            widthArr[i] = widthStandard * vertical;
            System.out.println("widthArr[" + i + "] = " + widthArr[i]);
        }
    }

    @Override
    public void run() {

        try {
            seperateWidth();
            float sum = 0;
            for (int i = 0; i < count; i++) {
                sum += widthArr[i];
                Thread.sleep(1);
                System.out.println(i + "번째 값" + sum);
            }
            System.out.println("가로 x 세로 = " +  sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
