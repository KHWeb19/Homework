import java.util.HashMap;
import java.util.Map;

public class MapBaseDuplicateCheckTest {
    public static void main(String[] args) {
        // Map(key, value)
        Map<String, Integer> m = new HashMap<>();

        String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem", "to" };

        for(String s : sample){
            // m이라는 Map에서 sample 에서 하나씩 넘어온 문자열을 key값에 검색해서
            // value값을 freq에 셋팅
            Integer freq = m.get(s);

            m.put(s, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + "개의 단어가 있습니다!");
        System.out.println(m.containsKey("to"));
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
