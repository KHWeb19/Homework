public class Homework10 {
    public static void main(String[] args) {
        //10. 1 ~ 100까지의 숫자를 순회한다.
        //
        //     9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        //
        //     다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        //
        //     이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        // 1 ~ 100 까지 순회 -> for문 사용

        final int START = 0;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        final int range = MAX - MIN + 1;

        int num = 0;
        int sum = 0;

        for (int i = START; i <= END; i+= num){
            num = (int)(Math.random()*range +MIN);

            System.out.println("이동할 자릿수 >> "+ num);

            sum += num;

            System.out.println("내가 이동한 자리 >> "+sum);

        }
    }
}
