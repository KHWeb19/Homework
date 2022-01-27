import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // put을 통해서 Map(key, value) 형식으로 저장이 가능하다.
        // 즉, key값이 1에 new Test()로 만들어진 객체가 value로서 저장된다.
        Map<Integer, Test> test = new HashMap<>();

        test.put(1, new Test());
        test.put(2, new Test());
        test.put(3, new Test());

        System.out.println(test);

        test.remove(2);

        System.out.println("remove() 이후::   "+test);

        // key값이 같은 경우에 put()을 하면 내용이 덮어써진다.
        test.put(3, new Test());

        System.out.println(test.get(3));
        //get()을 통해 특정 key값의 내용물을 가지고 올 수 있다.
        System.out.println("put() 이후::   "+test.get(3));

        // Map.Entry파트는 실제 key 값과 value 값을 분리하기 위해 항상 동일한 패턴으로 사용하는 녀석들이다.
        // 즉, Map에서 key값과 value 값을 따로 분리하고자 할때 사용하면 된다.
        // test(Map객체)로 test.entrySet을 하면 Map.Entry 형태를 얻게 된다.
        for(Map.Entry<Integer, Test> t: test.entrySet()){
            // getKey()는 key값을 획득
            Integer key = t.getKey();
            // getValue()는 말 그대로 value 값을 획득득
           Test value = t.getValue();

            System.out.println("key = "+ key+"value = "+ value);
        }
    }
}
