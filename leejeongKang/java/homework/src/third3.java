public class third3 {
    public static void main(String[] args) {
        int num1=1;
        System.out.println("1번째 항 : " + num1);
        int num2=1;
        System.out.println("2번째 항 : "+ num1);
        int num3=1;
        System.out.println("3번째 항 : "+ num1);

        for ( int i=4; i<26; i++) {
            int result = num1 + num3;
            System.out.printf("%d번째 항 : %d\n", i, result);
                num1= num2;
                num2 = num3;
                num3= result;
        }
    }
}
