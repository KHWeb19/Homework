public class P11 {
    public static void main(String[] args) {

        // Math.random으로 나오는 값의 범위 : 0.0 ~ 1.0 미만 (0.9999xxx)
        int rand = (int)(Math.random()*58+65);
        //  최소: 65 ~ 최대: 122, 두 값의 차 : 57, 0~57까지의 난수를 발생시켜 최솟값 65를 더해주면 65~122 범위가 된다

        if((rand>=65)&&(rand<=90)){
            System.out.printf("난수의 값(65~90) = %d\n", rand);
        }
        else if((rand>=97)&&(rand<=122)){
            System.out.printf("난수의 값(97~122) = %d\n", rand);
        }
        else
            System.out.println("현재 난수의 값 " + rand + "은 범위에 해당되지 않습니다.");
    }
}
