import java.util.Random;

public class Horse implements Runnable{ //스레드를 인터페이스 한다...run만 사용할 때
    private String horseName;
    private int waittingTime;

    // Random을 만드는 또 다른 방법중 하나인 Random 클래스
    private final static Random generator= new Random();


    public Horse(String name){
        horseName=name;
        waittingTime = generator.nextInt(7373);

    }


    @Override
    public void run() {
        try {
            Thread.sleep(waittingTime);

        } catch (InterruptedException e) {//이부분은 자동입력됨
            e.printStackTrace();
        }
        System.out.println(horseName+"이(가) 들어옵니다");
    }


}




