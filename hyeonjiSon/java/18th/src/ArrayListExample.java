import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList를 만드는 방법
        //ArrayList를 적고 <> 꺽쇠 내부에 다룰 데이터 타입을 작성한다.
        //우리는 문자열을 다룰 생각이라 String을 넣었다.
        //데이터 타입 <<<----을 넣어도 된다고 했으니 어떤 것도 들어갈 수 있다?
                          //클래스(커스텀 데이터 타입)도 클래스명을 적어줄 수 있다.
        ArrayList<String> list = new ArrayList<>();

        //add(x): 그냥 현재 위치에서 순차적으로 값이 입력됨
        //        현재 위치란 처음엔 0, 그다음엔 1, 그 다음은 2 이와 같은 순차적인 구조를 의미함
        list.add("우유");
        list.add("계란");
        list.add("버터");
        //add(x, y): x인덱스에 y값을 넣는 형식임. 즉, 특정한 위치에 값을 넣을 수가 있음.
        list.add(1, "사과");
        list.add(2,"파인애플");
        list.add(4, "포도");

        //size(): ArrayList의 길이를 알려줌
        for(int i = 0; i < list.size(); i++){
            //get(x): x인덱스의 정보를 출력함
            System.out.println(list.get(i));
            System.out.println("\n 이제 3번 인덱스를 삭제합니다");
            list.remove(3);
        }
   }
}

/*
Q. ArrayList는 배열(Array)와 다른건가요?
A. 네 다릅니다. 어떻게 다른가?

배열의 메모리상 구조는 이런 모양새 입니다.
[0][1][2][3][4][5][6][7][8][9] ...

ArrayList는 메모리 구조상 이런 모양새 입니다.
[정보| 다음위치(주소)]      [정보| 다음위치(주소)]      [정보| 다음위치(주소)]
[정보| 다음위치(주소)]      [정보| 다음위치(주소)]      [정보| 다음위치(주소)]
[정보| 다음위치(주소)]      [정보| 다음위치(주소)]      [정보| 다음위치(주소)]

다음 위치(주소)가 어디를 가르키느냐에 따라 정보가 불연속적일 수 있음.
ArrayList의 이점은 무엇일까?


 */
