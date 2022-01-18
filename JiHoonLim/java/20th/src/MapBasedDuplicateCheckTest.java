import java.util.HashMap;
import java.util.Map;

public class MapBasedDuplicateCheckTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        String[] sample = { "to", "be", "be","or", "not","to", "be" , "is",  "a", "problem" };

        for (String s: sample){
            // 현재 m 이라는 Map 에서 sample에서 하나씩 넘어온 문자열을
            // key로 검색하여 value값을 freq에 세팅
            Integer freq = m.get(s);
            // 삼항 연산자
            m.put(s, (freq == null)? 1 : freq + 1);
        }

        System.out.println(m.size() + "개의 단어");
        // m Map 객체에서 "to" 라는 key 값을 가진 정보가 있는지 논리 판정
        System.out.println(m.containsKey("to"));
        // m Map 객체에가 현재 비어 있는지 논리 판정
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
