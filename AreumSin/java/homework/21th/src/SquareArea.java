public class SquareArea {
    public static void main(String[] args) throws InterruptedException {
        // 여기서 thread가 필요한 이유는 뭐죠..?
        Area ar = new Area();

        Thread a = new Thread(new XPoint(ar, 2,false));
        Thread a1 = new Thread(new XPoint(ar, 2,true));

        a.start();
        a1.start();

        //a.join();

    }
}
