import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /*
        ArrayList 생성법
        ArrayList <> (<> 내부에 데이터타입 지정)
        *** class 도 대입 가능 ***
        ----------------------------------
        장점
        - 데이터의 추가 , 삭제 에 유용
         */

        ArrayList<String> list = new ArrayList<>();

        list.add("우유");
        list.add("계란");
        list.add("버터");

        //  0   1   2
        // 우유 계란 버터

        list.add(1,"사과");
        list.add(2,"파인애플");
        list.add(4,"포도");

        //  0    1     2   3    4   5
        // 우유  사과  파인 계란  포도 버터
        // 인덱스 빈자리는 먼저 선언한것이 들어감
        // 인덱스를 소유하고 있다면 자리 우선권
        // 그 자리에 있던 데이터는 인덱스 빈자리가 있는 곳 까지 뒤로 밀림

        for (int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // 인덱스 3번 제거
        list.remove(3);

        for (int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
