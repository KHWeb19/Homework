public class QuadRangleClass {
    public static void main(String[] args) {
        Thread t = new Thread(new QuadRangle(2,2));
        t.start();

    }
}
