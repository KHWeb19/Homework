import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Test> test = new HashMap<>();

        // put 으로 Map(key, value) 형식으로 저장
        // key 값 1에 new Test() 로 만들어진 객체가 value로 저장
        test.put(1, new Test());
        // key 값 2에 new Test() 로 만들어진 객체가 value로 저장
        test.put(2, new Test());
        // key 값 3에 new Test() 로 만들어진 객체가 value로 저장
        test.put(3, new Test());

        System.out.println(test);

        // 해당 key 값을 삭제
        test.remove(2);

        System.out.println("remove() 이후: " +test);

        // 내용을 덮어쓴다.
        test.put(3,new Test());

        System.out.println("put() 이후 : " +test);


        // Map.Entry 는 실제 key 값과 value 값을 분리하기 위해 항상 동일한 패턴으로 사용
        // Map 에서 key 값과 value 값으 따로 분리할 때 사용
        // test(Map의 객체) 롤 test.entryset을 하면 Map.Entry 형태태
       for (Map.Entry<Integer, Test> t : test.entrySet()){
            Integer key = t.getKey();
            Test value = t.getValue();
            System.out.println("key = " +key+ "value = " +value);
       }
    }
}
