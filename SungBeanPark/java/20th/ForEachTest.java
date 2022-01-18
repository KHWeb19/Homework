import java.util.ArrayList;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();

        list.add(new Test());
        list.add(new Test());
        list.add(new Test());

        for(Test t: list){
            System.out.println(t);
        }
    }
}
