public class QuadraticFxTest {


    public static void main(String[] args) {
        Thread t1 = new Thread(new QuadraticFx());
        t1.start();
    }
}
