import java.util.Random;

public class Horse implements Runnable{
    private String horseName;
    private int waitingTime;
    private final static Random generator = new Random();   //random만드는 클래스

    public Horse (String name){
        horseName = name;
        //nextInt(범주)는 0~ (7777-1) 까지
        // 예로 10~ 7777을 표현하고 싶다면 0~7767 ----> nextInt(7768) + 10;
        waitingTime = generator.nextInt(7777);
    }
    public void run() {
        //try{}내에 동작하는 코드가 문제를 유발시키면 catch 에서 어떤문제인지 출력 (문제없으면  try만실행)
        try{
            Thread.sleep(waitingTime);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(horseName + "이 경주를 완료하였습니다!!!!!");
    }
}
