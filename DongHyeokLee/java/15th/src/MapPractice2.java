import java.util.HashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String , Integer> m = new HashMap<>();

        String[] s = {"a",  "b", "c", "d", "a","b"};

        for(String str : s){

            Integer freq = m.get(s);

            m.put(str, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m);
    }
}
