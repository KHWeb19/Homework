import java.util.ArrayList;

public class ForEachTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();

        list.add(new Test());
        list.add(new Test());
        list.add(new Test());

        // foreach 형식
        // list 에 값을 하나씩 t에 넣고 출력
        // 가져올 값이 없을 때가지 반복
        for (Test t : list){
            System.out.println(t);
        }
    }
}
