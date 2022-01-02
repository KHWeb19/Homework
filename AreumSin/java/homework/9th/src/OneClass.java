public class OneClass {
    public static void main(String[] args) {
        // 문제은행[2] 5 ~ 8

        One one = new One();

        one.init_Hun();

        System.out.println("2의 배수");
        one.multiBy2();
        System.out.println();

        System.out.println("3의 배수");
        one.multiBy3();
        System.out.println();

        System.out.println("4의 배수 합");
        one.multiBy4();
        System.out.println();

        one.printMulti();
        System.out.println();
    }
}
