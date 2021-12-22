public class P09 {
    public static void main(String[] args) {

        // Math.random으로 나오는 값의 범위 : 0.0 ~ 1.0 미만 (0.9999xxx)
        int rand = (int)(Math.random()*94+4);
        System.out.printf("난수의 값 = %d\n", rand);
        //  최소: 4 ~ 최대: 97, 두 값의 차 : 93, 0~93까지의 난수를 발생시켜 최솟값 4를 더해주면 4~97 범위가 된다.


    }
}
