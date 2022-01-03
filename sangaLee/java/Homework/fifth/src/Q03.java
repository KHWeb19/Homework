import java.lang.reflect.Field;
import java.util.Random;

public class Q03 {
    public static void main(String[] args) {

        /* Q3. 배열로 로또 문제를 만들어보기 100명중 5명을 뽑아보도록 하자
               배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다. */

        // 배열을 생성한다. 그중에 5명만 당첨으로 한다.

        // if 100 중에서 숫자를 뽑았는데 당첨숫자가 뜬다면 '축! 당첨!' 출력
        // else 당첨숫자가 아니라면 '서민체험 연장되셨습니다^^;' 출력
        // 여기서 막혔습니다.................

        final int MAX = 100; final int MIN = 5; final int RANGE = MAX - MIN + 1;
        int[] Lucky = {19,99,1,2,5}; // 당첨 번호를 생성

        Random rand = new Random();
        for (int i=0; i<5; i++) {

            // if ()

        }





    }
}
