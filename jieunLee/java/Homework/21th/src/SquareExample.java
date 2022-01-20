public class SquareExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Square());
        t1.start();
    }
}
