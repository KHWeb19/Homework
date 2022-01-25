import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        String[] duplicate = {"중복", "노중복", "중복", "예스중복"};

        for(String dup : duplicate){
            // add() 동작시 중복이 발생하면 false를 리턴
            if(!s.add(dup)) {
                System.out.println("중복된 단어 : " + dup);
            } else {
                System.out.println("중복 아닌 단어 : " + dup);
            }
        }

        System.out.println("중복되지않은 단어 : " + s);
    }
}
