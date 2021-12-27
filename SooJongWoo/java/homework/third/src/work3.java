public class work3 {
    public static void main(String[] args) {
        // 숫자의 규칙을 찾아 25번쨰 항을 구하도록 프로그램 해보자
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int num4;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        for(int i=4; i<=25; i++){
            num4 = num1 + num3;
            System.out.println(num4);
            num1 = num2;
            num2 = num3;
            num3 = num4;
        }
    }
}
