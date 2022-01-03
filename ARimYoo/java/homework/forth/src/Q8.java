public class Q8 {
    public static void main(String[] args) {

        // 1 ~ 100까지 숫자를 순회한다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력


        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;
        int range = MAX - MIN + 1;

        // 2~10 사이 랜덤 숫자 = Math.random() 사용
        int rand = (int)(Math.random() * range + MIN);

        int i;

        // 순회한다 = for문 사용
        for (i = START; i <= END; i++){

            // 조건을 만족할 시 배수출력 = if문 사용
            // 랜덤값으로 나눈 값의 나머지가 0일 때 랜덤값의 배수로 볼 수 있음.
            if (i % rand == 0){

                System.out.printf("%d의 배수값 : %d\n" , rand, i);
            }
        }
    }
}
