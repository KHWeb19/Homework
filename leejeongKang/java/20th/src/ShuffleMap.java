import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleMap {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        for (int i =1; i<=10; i++){
            list.add(1);
        }
        while (true){
            Collections.shuffle(list);
            System.out.println(list);
            Thread.sleep(1000);
        }
    }
}
