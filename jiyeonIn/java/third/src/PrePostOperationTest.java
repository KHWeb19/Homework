public class PrePostOperationTest {
    public static void main(String[] args) {

        int i = 0;


        System.out.println("전위 연산");
        System.out.println("i = " + (++i));
        System.out.println("i = " + i);

        i = 0;

        System.out.println("초기화 확인 i = " + i);

        System.out.println("후위 연산");
        System.out.println("i = " + (i++));
        System.out.println("i = " + i);
    }
}