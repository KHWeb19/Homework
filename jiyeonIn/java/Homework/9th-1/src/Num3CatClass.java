import java.util.Scanner;

public class Num3CatClass {
    public static void main(String[] args) {
        //고양이 클래스 만들어라..
        //고양이는 1. 운다. 2. 응가싼다
        //1. 운다 : 주인이 오면.
        //2. 응가싼다. 시간 별 행동
        Num3Cat cat = new Num3Cat();

        System.out.print("지연이의 집에 고양이가 몇마리야?");
        cat.cat();

        System.out.print("지연이가 집에 (1.나갔다 / 2. 들어왔다)");
        cat.cry();

        System.out.print("고양이가 응가 싸고난 후 행동 시간 별(24시간 중 입력해보시오)");
        cat.ddong();
    }
}
