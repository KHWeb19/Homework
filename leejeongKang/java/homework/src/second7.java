public class second7 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*58 + 65);
        System.out.println("<과제 11번>");
        if (65<=a && a <=90 ) {
            System.out.printf("65 ~ 90 혹은 97 ~ 122 범위 안의 변수를 무작위로 출력하시오 : %d" , a);
        }
        else if (97<=a && a<=122) {
            System.out.printf("65 ~ 90 혹은 97 ~ 122 범위 안의 변수를 무작위로 출력하시오 : %d" , a);
        }
        else{
            System.out.println("다시 컴파일 하세여");
        }
    }
}

