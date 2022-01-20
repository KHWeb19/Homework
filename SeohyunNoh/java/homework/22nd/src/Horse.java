import java.util.Random;

public class Horse implements Runnable {
    private String horseName;
    private int waitingTime;

    private final static Random generator = new Random();

    public Horse (String name){
        horseName = name;
        waitingTime = generator.nextInt(7777);
    }

    // run() --> Thread가 구동시킬 매서드
    @Override
    public void run() {
        try{
            Thread.sleep(waitingTime);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(horseName + "가(이) 경주를 완료하였습니다.");
    }
}
