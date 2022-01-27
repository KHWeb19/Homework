import java.util.ArrayList;
 public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();
        list.add (new Test());
        list.add (new Test());
        list.add (new Test());

        //foreach
        //list에 들어있는 값을 하나씩 빼와서 t에 배치한다.
        for(Test t : list){
            System.out.println(t);
        }
    }
}
