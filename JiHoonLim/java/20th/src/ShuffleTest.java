import java.util.*;

public class ShuffleTest {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        // 1 ~ 10 값 배정
        for (int i = 1; i <= 10; i++){
            list.add(i);
        }


        while(true){
            // list 값을 섞는다
            Collections.shuffle(list);
            System.out.println(list);
            Thread.sleep(1000);
        }
    }
}
