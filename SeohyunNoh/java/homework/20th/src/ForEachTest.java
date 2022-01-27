import java.util.ArrayList;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<>();

        list.add(new Test());
        list.add(new Test());
        list.add(new Test());

        // list에 들어있는 값을 하나씩 빼와서 t에 저장
        // 더 이상 list에서 가져올 수 있는 정보가 없을 때까지 loop 돈다
        for(Test t : list){
            System.out.println(t);
        }
    }
}
