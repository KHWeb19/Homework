public class Run {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Quiz1Square(2,2));
        t1.start();
    }
}
