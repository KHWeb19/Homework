import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<Integer ,String> m = new HashMap<>();

        m.put(1,"안녕");
        m.put(2,"디지몬");
        m.put(3,"너와 함께");

        System.out.println(m);

        m.remove(2);

        System.out.println(m);

        m.put(3,"중복데스");
        //오 덮어 쓴다
        m.put(777,"럭키세븐");

        System.out.println(m);

        for(Map.Entry<Integer , String> t : m.entrySet()){
            Integer key = t.getKey();

            String value = t.getValue();

            System.out.println("key" + key + "value" + value);
        }


    }

}
