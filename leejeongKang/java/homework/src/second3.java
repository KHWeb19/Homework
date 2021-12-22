public class second3 {
    public static void main(String[] args) {

        int a = (int)(Math.random() * 6 +1 );
        System.out.println("<과제 7번>");
        System.out.printf("주사위의 수 : %d\n", a);
        if (a%2 == 0){
            System.out.println("당첨입니다.");
        }
        else {
            System.out.println("꽝");
        }
    }
}

