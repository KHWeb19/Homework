public class Homework4 {
    public static void main(String[] args) {

       // 구구단 7단을 출력해보자!
        /* 7단을 출력해야하니 일단 7 * START = END 7은 바꿀 필요없고 for반목문으로 START END를 반복해주자*/

        final int STAGE = 7;
        final int START = 1;
        final int END = 10;

        for (int i = START; i < END; i++) {
            System.out.printf("%d x %d = %d\n", STAGE, i, STAGE * i);
        }
    }
}


