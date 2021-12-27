public class Q8 {
    public static void main(String[] args) {

        //1 ~ 100까지 숫자를 순회한다.
        //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        int i = 0;
        int rand = (int)(Math.random()*9+1);
        System.out.println("랜덤 숫자 = " + rand);

        for (i=2; i<100; i++) {
            if (i % rand == 0) {
                System.out.printf("%d의 배수 = %d\n", rand, i);

            }
        }
    }
}
