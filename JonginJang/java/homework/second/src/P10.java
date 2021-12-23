public class P10 {
    public static void main(String[] args) {

        // Math.random으로 나오는 값의 범위 : 0.0 ~ 1.0 미만 (0.9999xxx)
        int rand1 = (int)(Math.random()*26+65);
        //  최소: 65 ~ 최대: 90, 두 값의 차 : 25, 0~25까지의 난수를 발생시켜 최솟값 65를 더해주면 65~90 범위가 된다.
        int rand2 = (int)(Math.random()*26+97);
        //  최소: 97 ~ 최대: 122, 두 값의 차 : 25, 0~25까지의 난수를 발생시켜 최솟값 97를 더해주면 97~122 범위가 된다.
        //
        System.out.printf("첫 번째 난수의 값(65~90) = %d\n", rand1);
        System.out.printf("두 번째 난수의 값(97~122) = %d\n", rand2);


    }
}
