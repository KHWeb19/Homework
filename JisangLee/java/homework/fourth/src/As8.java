public class As8 {
    //1 ~ 100까지의 숫자를 순회한다.
    //2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력
    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;

        final int REMAIN = 0;

        final int MAX = 10;
        final int MIN = 2;

        int range = MAX - MIN +1;
        int rand = (int)(Math.random() * range + MIN);

        System.out.printf("%d ~ %d 사이이 랜덤한 숫자를 선택: %d \n",MIN, MAX, rand);
        System.out.printf("       %d의 배수를 출력\n", rand);

        for(int i = START; i <= END; i++ ){
            if(i % rand == REMAIN){
                System.out.println("             " + i);
            }
        }
    }
}
