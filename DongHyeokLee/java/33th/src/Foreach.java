import java.util.ArrayList;
import java.util.List;

public class Foreach {

    List<Integer> test = new ArrayList<>();

    public Foreach (){
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        for(int t : test){
            System.out.println(t);
        }

    }


}
