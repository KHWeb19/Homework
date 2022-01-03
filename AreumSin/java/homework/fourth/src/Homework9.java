public class Homework9 {
    public static void main(String[] args) {
        //9. 1 ~ 100까지의 숫자를 순회한다.
        //
        //    2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        //
        //    다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        //
        //    그 다음 루프에서 다시 작업을 반복한다.
        //
        //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        // 1 ~ 100 까지 순회 for문 이용
        // 2 ~ 10 사이 난수를 생성.
        // 배수를 출력하기 전까지 반복해야함.


        final int START = 1;
        final int END = 100;

        final int MAX = 10;
        final int MIN = 2;

        final int RANGE = MAX -MIN +1;
        int num1 = 0;
        int sum = 0;

        boolean isCheak = false;

        for(int i = START; i <= END; i++){
            while (!isCheak) { // false 동안 계속 진행할거야!
                num1 = (int)(Math.random()* RANGE + MIN); // 2~ 10 사이의 난수 출력.
                isCheak = true; // 난수 생성하면 true -> 난수 생성을 잠시 멈춤.
            }

            //System.out.println(num1 + "" + i);

            if(i % num1 == 0){
                System.out.printf("%d 배수 합 %d\n",num1, i); // 출력한 후에는 랜덤으로 난수 생성해야함. -> isCheck가 false가 되야함.
                isCheak = false;
                sum += i;
            }
        }

        System.out.println("다 더한수는 "+sum);
    }
}
