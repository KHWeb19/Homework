public class P01 {
    public static void main(String[] args) throws InterruptedException {
        //가로,높이,기준
        Thread t1 = new Thread(new Quadrilateral("t1",2,2,0.01f));
        Thread t2 = new Thread(new Quadrilateral("t2",3,3,0.03f));
        Thread t3 = new Thread(new Quadrilateral("t3",13,20,0.05f));

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
