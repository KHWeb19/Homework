import java.util.HashMap;
import java.util.Map;

public class MapBasedDuplicateCheckTest {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // key값이 겹치지 않음.

        String[] sample = {"to", "be", "or", "not","kai","to","kai","kai","problem"};

        for(String s: sample){
            // 현재 m이라는 Map에서 sample에서 하나씩 넘오온 문자열을
            // key로 검색하여 value 값을 freq에 세팅함.

            // key는 중복될 수 없음.
            Integer freq = m.get(s);
            // 삼항연산자
            // 질문? 참이면 : 거짓
            m.put(s,(freq == null)? 1: freq +1);
        }

        System.out.println(m.size() + "개의 단어가 있습니다");
        System.out.println(m.containsKey("kai"));
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
