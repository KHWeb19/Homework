public class Home6 {
    public static void main(String[] args) {
        //1 ~ 100까지 숫자중 3의 배수만 출력해보자!
        //for문으로 1 ~ 100까지 반복을 돌린다.
        //if문과 % 3 = 0 으로하여 3의 배수를 끄집어낸다.
        //그렇다

        final int START = 1;
        final int END = 100;
        final int RE = 3;
        final int ww = 0;

        for(int i =  START; i < END; i++)
            if(i % RE == ww){
                System.out.printf("3의 배수는 : %d\n", i);
            }
    }
}
