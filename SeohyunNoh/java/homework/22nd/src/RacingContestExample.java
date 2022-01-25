public class RacingContestExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Horse("적토마"));
        Thread t2 = new Thread(new Horse("질풍마"));
        Thread t3 = new Thread(new Horse("뇌전마"));

        // start()를 하는 순간 run()매서드 구동
        t1.start();
        t2.start();
        t3.start();
    }
}
