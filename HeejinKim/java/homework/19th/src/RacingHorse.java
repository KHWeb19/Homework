public class RacingHorse {
    public static void main(String[] args) {
        // new Thread(스레드화시킬 클래스를 객체화하여 만들어줌)
        // 그리고 new Thread로 구동되려면
        // new Thread 내부에서 객체화할 클래스가
        // 반드시 Runnable이라는 interface를 implements 해줘야 합니다.
        Thread t1 =new Thread(new Horse("유니콘")); //스레드화 시킬 클래스를 객체화하여 만들어줌
        Thread t2 =new Thread(new Horse("적토마"));
        Thread t3 =new Thread(new Horse("조랑말"));


        t1.start();
        t2.start();
        t3.start();


    }

}
