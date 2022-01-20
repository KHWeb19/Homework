public class AreaThread2  implements  Runnable {

    Area2 ar;
    private double x = 0;
    private double y =0;
    double sum;
    private static double width;
    private static double slice;

    public AreaThread2(final double width,final double slice) {

        this.width=width;
        this.slice=slice;
        ar=new Area2();

        }

    public double getX() {
        return x;
    }

    public double getSum() {
        return sum;
    }

    public static double getWidth() {
        return width;
    }

    public static double getSlice() {
        return slice;
    }

    @Override
    public void run() {
        for (int i = 0; i < ar.calDivide(); i++) {

            x+=slice;
            y=x*x;
            sum+= slice*y;
        }
        System.out.println(sum);
    }

}
