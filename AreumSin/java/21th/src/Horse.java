import java.util.Random;

public class Horse implements Runnable{
    // java에서 제공하는 Runnable 을 implements함.

    private String horseName;
    private int waitingTime;
    // Random을 만드는 또 다른 방법중 하나인 random 클래스 -> 자바에서 제공해주는 것.
    private final static Random generator = new Random(); // 랜덤 클래스 사용

    public Horse(String name){
        horseName = name;
        // nextInt(범주)sms 0~7777 -1 까지
        // 즉 7777개의 개수를 의미함.

        // 예로 10 ~ 7777
        // 0 ~ 7767 ---> nextInt(7767) + 10;
        waitingTime = generator.nextInt(7777) + 7777; // 이게 스케너랑 같은건가? 아님. ㅋㅋㅋㅋ
        // 소요되는 시간을 랜덤으로
    }


    // Runnable이라는 interface를 implements 한 내용임
    // run()은 스레드라는 녀석이 구동시킬 매서드
    @Override
    public void run() {
        // try{} catch{} 부분은
        // try 내애서는 동작하는 코드가 문제를 유발시키면
        // catch 쪽에서 어떤 문제가 있는지 출력하는 구조다.
        // 문제가 발생하지않을때, try{}만 실행된다.
        try {
            Thread.sleep(waitingTime); // run을 조금 느리게 해라 얼마정도? -> waitingTime만큼.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(horseName + "가(이) 경주를 완료하였습니다 !!!");

    }
}
