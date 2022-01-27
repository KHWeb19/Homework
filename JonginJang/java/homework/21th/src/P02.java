public class P02 {
    public static void main(String[] args) throws InterruptedException {

    Thread t1 = new Thread(new QuadraticFunction("t1",0.0f,3.0f,0.001f));
    Thread t2 = new Thread(new QuadraticFunction("t2",0.5f,6.0f,0.005f));
    Thread t3 = new Thread(new QuadraticFunction("t3",15.0f,27.0f,0.002f));

    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    t3.join();

    }
}
