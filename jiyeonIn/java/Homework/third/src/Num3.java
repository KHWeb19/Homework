public class Num3 {
    public static void main(String[] args) {
        //3. 1,1,1,2,3,4,6,9,13,19,28,41,60,88,129...
        //이와같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램을 만들기

        // 첫번째 세번째 합 / 두번째 네번째 합 요런식으로
        // 피보나치와 비슷하게 가면 될듯

        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        System.out.println("1번째 : " +num1);
        System.out.println("2번째 : " +num2);
        System.out.println("3번째 : " +num3);

        for (int i=4;i<=25;i++) {
            int num4 = num1 + num3; //num4 = 1+1 =2 / num5 = num2 + num4
            System.out.println(i + "번째 : " + num4);
            num1 = num2;
            num2 = num3;//
            num3 = num4; //
            //nun1~num3 값이 하나씩 변하도록 만들기
        }
    }
}
