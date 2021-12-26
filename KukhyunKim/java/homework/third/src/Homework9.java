public class Homework9 {
    public static void main(String[] args) {
        // 9. 1~100까지의 숫자를 순회한다.
        for (int i = 1; i < 101; i++) {
            System.out.printf("1~100 숫자 %d\n", i);
        }
        // 2~10사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        int a = (int)(Math.random() * 9 + 2 );
        System.out.println(a*2);
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //
        // -->>> 랜덤한 a값에서 다시 새로운 b값으로 랜덤숫자를 지정해서(ex- 1~1000사이의 숫자중 랜덤)
        // 새로운 b값에서 랜덤으로 다시 숫자의 배수를 출력하는게 맞는지 알고싶습니다.
        //
        // int b = (int)(Math.random() * 1001 + 1 );
        // System.out.println(b*2);
        // 그 다음 루프에서 다시 작업을 반복한다.
        // 이후에는 이전것에서 막혀서 더이상 진행하지 못하였습니다...

        // 끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가?


    }
}
