public class calculateRectangleMain {
    public static void main(String[] args) {

        calculateRectangle calcRec = new calculateRectangle(2,2);

        Thread thread1 = new Thread(calcRec);

        thread1.start();


    }
}
