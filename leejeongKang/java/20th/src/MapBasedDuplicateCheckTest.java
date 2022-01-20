import java.util.HashMap;
import java.util.Map;

public class MapBasedDuplicateCheckTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        String[] sample = {"to","be","or", "not","to","be","is","a","problem","to"};

        for (String s : sample){
            Integer freq = m.get(s);
            m.put (s, (freq==null)? 1 : freq+1);
        }

        System.out.println("Map size : " +m.size());
        System.out.println("Map - to ? "+m.containsKey("to") );
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
