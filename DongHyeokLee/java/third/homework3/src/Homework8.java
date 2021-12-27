public class Homework8 {
    public static void main(String[] args) {
        //1~100까지 순회
        // 2~10사이의 랜덤한 숫자를 선택 이 숫자의 배수 출력

        final int MAX = 10, MIN = 2;
        final int START = 1, END=100;
        final int REMAIN = 0;
        int range = MAX - MIN +1;
        int decision = (int)(Math.random()*range+MIN);

        for(int i=START; i<=END; i++){

            if(i % decision == REMAIN){
                System.out.printf("%d의 배수 = %d\n" , decision, i);
            }

        }

    }
}
