public class FxTest {
    public static void main(String[] args) {
        Fx fx = new Fx(0.001);
        Thread thread = new Thread(fx);
        thread.start();
    }
}
