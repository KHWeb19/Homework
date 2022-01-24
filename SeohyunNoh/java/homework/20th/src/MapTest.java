import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Test> test = new HashMap<>();

        // put을 통해서 Map(key, value) 형식으로 저장이 가능.
        // key값 1에 new Test()로 만들어진 객체가 value로서 저장
        test.put(1, new Test());
        test.put(2, new Test());
        test.put(3, new Test());

        System.out.println(test);

        test.remove(2);

        System.out.println("remove() 이후 : " + test);

        // put의 또 다른 특성 중 하나는
        // 같은 key값에 새로운 값을 넣으면
        // 내용을 덮어쓰게 됨
        test.put(3, new Test());

        System.out.println("put() 이후 test.get(3)" + test.get(3));

        // Map.Entry는 실제 key값과 value 값을 분리하기 위해 항상 동일패턴으로 사용
        // 즉, Map 에서 key값과 value값을 따로 분리하고자 할 때 사용
        // test(Map의 객체)로 test.entrySet을 하면
        // Map.Entry형태를 얻게 됨
        for(Map.Entry<Integer, Test> t : test.entrySet()){
            Integer key = t.getKey();
            Test value = t.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

    }
}
