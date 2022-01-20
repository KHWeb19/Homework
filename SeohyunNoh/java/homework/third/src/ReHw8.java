public class ReHw8 {
    public static void main(String[] args) {
        /*
        1. 1~100까지 순회하는 것 만들고
        2. 2~10 사이의 랜덤값이 나올 수 있게 만들고
        3. 그 나온 랜덤값의 배수를 출력하도록
         */
        final int START = 1;
        final int END = 100;

        final int MIN = 2;
        final int MAX = 10;
        final int range = MAX - MIN + 1;

        final int REMAIN = 0;

        int rand = (int)(Math.random() * range + MIN);

        for(int i = START; i <= END ; i++){

            if(i % rand == REMAIN){
                System.out.printf("%d의 배수 : %d\n", rand, i);
            }

        }
    }
}
