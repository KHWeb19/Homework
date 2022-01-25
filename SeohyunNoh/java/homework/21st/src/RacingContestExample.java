public class RacingContestExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Horse("적토마"));
        Thread t2 = new Thread(new Horse("질풍마"));
        Thread t3 = new Thread(new Horse("뇌전마"));

        // 프로세스 : 프로그램 전체 (main을 포함)
        // 스레드 : 프로그램의 일부 (main이 포함되지 않음)
        // 둘의 공통점 --> 모든 CPU상에서 구동되기 위해 메모리에 올라가 있다(적재)
        // 즉, 포괄적인 범위에서는 둘 다 객체에 해당함
        t1.start();
        t2.start();
        t3.start();
    }
}
