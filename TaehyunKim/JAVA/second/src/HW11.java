public class HW11 {
    public static void main(String[] args) {
        // 11. 65 ~ 112 난수 무작위 생성 후 65~90 혹은 97~122 해당하는 숫자 출력

        System.out.println("11. 65 ~ 112 난수 무작위 생성 후 65~90 혹은 97~122 해당하는 숫자 출력");

        int min = 65;
        int max = 122;

        int a = (int) (Math.random() * (max - min + 1) + min);

        boolean test1 = (a >= 65 && a<=90);
        boolean test2 = ( a>= 97 && a<=122);

        if (test1 || test2){
            System.out.println("패스통과, 값: " +a);
        }
        else{
            System.out.println("패스 통과 실패");
        }

    }
}
