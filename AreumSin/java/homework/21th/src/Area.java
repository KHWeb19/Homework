import java.util.concurrent.locks.Lock;

public class Area {

    private final double num = 0.001;

    //  static double xPoint;
    // private static int yPoint;
    private static double area;
    //private Lock lock;

    public void addArea(int yPoint){
        //area = 0.0;
        try{
            //lock.lock();
            area += yPoint*num;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //lock.unlock();
        }
    }

    public void run(int count, int xPoint, int yPoint) {
        area = 0.0;
        for(int i = 0; i < count; i++){
            //System.out.println(i);
            addArea(yPoint);
        }
    }

    public static double getArea() {
        return area;
    }
}
