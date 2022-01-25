import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < 11; i++){
            list.add(i);
        }

        while(true){
            // 선택하고 ctrl + b 누르면 알아볼 수 있음. (데이터 타입, 사용방법등)
            Collections.shuffle(list);
            System.out.println(list);
            System.out.println();
            Thread.sleep(1000);
        }
    }
}
