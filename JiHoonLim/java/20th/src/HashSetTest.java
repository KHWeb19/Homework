import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        String[] duplicate = { "중복", "노중복", "중복", "예스중복"};

        for (String dup: duplicate){
            // add() 동작시 중복이 발생하면 false 리턴
            // true가 되서 아떤 값이 중복인지 판정
            if (!s.add(dup)){
                System.out.println("중복된 단어: " + dup);
            }
        }

        System.out.println("중복되지 않은 단어: " +s);
    }
}
