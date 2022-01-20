import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Test> test = new HashMap<>();
        //put을 통해서 Map(key, value) 형식으로 저장이 가능하다.
        //key값 1에 new Test()로 만들어진 객체가 value로 저장된다.
        test.put(1, new Test());
        // key값 2에 new Test() 객체가 저장된다.
        test.put(2, new Test());
        test.put(3, new Test());
        System.out.println(test);

        test.remove((2));
        System.out.println("remove()이후 : "+test);

        //put()의 또다른 특성으로 같은 key에 새로운 값을 넣으면 덮어쓰기 됌
        test.put(3, new Test());
        //get을 통해서 특정 key 값을 가져온다.
        System.out.println("test.put(3)이후 : "+ test.get(3));

        for(Map.Entry<Integer, Test> t : test.entrySet()){
            Integer key = t.getKey();
            Test value = t.getValue();
            System.out.println("key = "+ key + ", value ="+value);
        }

    }
}
