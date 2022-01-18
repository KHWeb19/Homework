import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //순서 X, 중복(키x, 값o)
        Map<Integer, Test> test = new HashMap<>();

        //put을 통해서 Map(key, value) 형식으로 저장이 가능
        // 즉 key값 1에 new Test()로 만드렁진 객체가 value로서 저장
        test.put(1, new Test());
        test.put(2, new Test());
        test.put(3, new Test());

        System.out.println(test);

        // 특정 key의 내용을 삭제
        test.remove(2);

        System.out.println("remove()이후 " + test);

        // put()의 또 다른 특성중 하나로
        // 같은 key에 값을 새로 넣으면 내용을 덮어 쓴다.
        test.put(3, new Test());

        // get()을 통해 특정 key값의 내용물을 가져올 수 있다.
        System.out.println("put()이후 test.get(3): " + test.get(3));

        // Map.Entry 파트는 실제 key 값과 value 값을 분리하기 위해 항상 동일한 패턴으로 사용하는 녀석들
        // 즉 Map에서 key값과 value 값을 따로 분리하고자 할 때 사용
        // test(Map의 객체)로 test.entrySet을 하면 Map.Entry형태를 얻게됨
        for(Map.Entry<Integer, Test> t: test.entrySet()){
            Integer key = t.getKey();
            Test value = t.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
