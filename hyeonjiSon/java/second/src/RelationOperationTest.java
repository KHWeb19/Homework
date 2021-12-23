public class RelationOperationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        //boolean 데이터 타입은 참, 거짓을 판정하는 데이터타입
        boolean res;

        res = num1 == num2; //같은가?
        System.out.println("res: " + res);

        res = num1 != num2; //다른가?
        System.out.println("res: " + res);

        res = num1 < num2; // num1이 num2 보다 작은가?
        System.out.println("res: " + res);

        res = num1 <= num2; // num1이 num2 보다 작거나 같은가?
        System.out.println("res: " + res);

        res = num1 > num2; //num1이 num2 보다 큰가?
        System.out.println("res: " + res);

        res = num1 >= num2; //num1이 num2 보다 크거나 같은가?
        System.out.println("res: " + res);
    }
}
