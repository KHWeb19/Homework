public class HorseRacing {
    public static void main(String[] args) {
        Thread t1 = new Thread (new Horse("티케"));
        Thread t2 = new Thread (new Horse("바람"));
        Thread t3 = new Thread (new Horse("꼬미"));


        //start()에 의해서 run()구동
        t1.start();
        t2.start();
        t3.start();
    }
}