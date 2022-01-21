import java.util.Arrays;

public abstract class CalculateManager extends Square implements Runnable {
    public double[] arraywidth1;
    public double[] arraywidth2;


    double Width1;
    double Width2;
    double TotalSum = 0;


    public CalculateManager(double Height, double Width) {
        super(Height, Width);
        Width1 = Width / 2;
        Width2 = Width / 2;

        int range = (int) (Width1 / SplitNumber);
        arraywidth1 = new double[range];
        arraywidth2 = new double[range];
    }


    public void splitwidth1() {
        Arrays.fill(arraywidth1, SplitNumber);
        System.out.println(Width1 + "를" + SplitNumber + "로 나눈 갯수:" + arraywidth1.length);
    }

    public void splitwidth2() {
        Arrays.fill(arraywidth2, SplitNumber);
        System.out.println(Width2 + "를" + SplitNumber + "로 나눈 갯수:" + arraywidth2.length);
    }


    public void printTotalSum() {
        System.out.println(TotalSum);
    }
    @Override
    public void run (double[] selcetArrayWidth) {
        for (double v : selcetArrayWidth) {
            TotalSum += v * Height;
            System.out.println(TotalSum);

        }
    }




}
