public class Homework8 {
    public static void main(String[] args) {
        // 1~100까지의 숫자를 순회한다.

        for (int i = 1; i < 101; i++) {
            System.out.printf("1~100 숫자 %d\n", i);
        }
        // 2~10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.
        int a = (int)(Math.random() * 9 + 2 );
        System.out.println(a*2);
/*
1~100까지의 숫자를 순회 하는것은 되나
2~10 사이의 랜덤한 숫자를 선택하여 선택숫자의 배수를 출력하는게 제가 해놓은게 맞는건지 틀린지 모르겠습니다.
*/
    }
}

