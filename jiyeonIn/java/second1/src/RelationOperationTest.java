public class RelationOperationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        // boolean 데이터 타입은 참, 거짓을 판정하는 데이터타입
        boolean res;

        res = num1 == num2;
        System.out.println("res: " + res);

        res = num1 != num2;
        System.out.println("res: " + res);

        res = num1 < num2;
        System.out.println("res: " + res);

        res = num1 <= num2;
        System.out.println("res: " + res);

        res = num1 > num2;
        System.out.println("res: " + res);

        res = num1 >= num2;
        System.out.println("res: " + res);
    }
}