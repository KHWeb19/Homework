public class Bank6 {
    public static void main(String[] args) throws InterruptedException {
     Area area = new Area(2,2,0.001);

     Thread t1 = new Thread(new AreaThread());

     t1.start();

     t1.join();

    }
}
