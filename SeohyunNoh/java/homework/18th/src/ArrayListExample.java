import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList 만드는법
        // ArrayList를 적고 <> 꺽쇠 내부에 다룰 데이터 타입을 작성한다.
        // 우리는 문자열을 다룰 생각이라 String을 넣었다.
        // 즉, <데이터타입 부분>에 클래스도 넣을 수 있음 *클래스는 커스텀데이터타입이니까*

        ArrayList<String> list = new ArrayList<>();

        // add() : 그냥 현재 위치에서 순차적으로 값이 입력됨.
        //         현재 위치란 처음엔 index0번 자리 > index1번 > intdex2번...
        list.add("우유");
        list.add("계란");
        list.add("버터");

        // add(x,y) : 인덱스 x에 y값을 넣는 형식. >> 특정한 위치에 값을 넣을 수 있음
        list.add(1,"사과");
        list.add(2,"파인애플");
        list.add(4,"포도");

        // list.size() : ArrayList의 길이를 알려줌
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n이제 3번 인덱스를 삭제합니다!\n");

        list.remove(3);

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
