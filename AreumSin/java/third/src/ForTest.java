public class ForTest {
    public static void main(String[] args) {

        //[1] 초기화 부분은 for문 진입시 최초 한번만 실행된다.
        //[2] 조건은 매 반복마다 검사한다.
        //[3] 증감은 중괄호 내부의 내용이 끝나면 진행된다.
        for (int i =1; i < 11; i++){
            System.out.println("i = "+i);
        }

        //초기화, 증감, 조건 모두 없어도 된다 => while 아닌가요?
    }
}
