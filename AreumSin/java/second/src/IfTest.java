public class IfTest {
    public static void main(String[] args) {

        // 0 ~9
        // 3 ~12
        int rand = (int)(Math.random()*10 +3);

        // == 같다라는 뜻이 아니라 같으가?이다
        if(rand %2 ==0) {
            System.out.println("나는 짝수: "+rand);
        }else
            System.out.println("나는 홀수: " + rand);
    }
}
