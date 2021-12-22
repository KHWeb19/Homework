public class PrintQnA {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7, num3 = 33, num4 = 77;

        System.out.println("num1 = " + num1+ "num2 = " + num2+
                "num3 = " + num3+ "num4 = "+num4);
        System.out.printf("num1=%d, num2=%d,num3=%d,num4=%d\n",
                num1, num2, num3, num4);

        System.out.print("print 엔터 없음");
        System.out.println("println 엔터 적용");
        System.out.printf("printf 엔터 없음");

        System.out.print("print 요렇게 엔터\n");
        System.out.println("println 쓰면 엔터");
        System.out.printf("printf는 오래 쓰면 엔터\n");
    }
}
