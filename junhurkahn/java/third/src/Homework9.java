public class Homework9 {
    public static void main(String[] args) {
        for(int i = 1; i < 101; i++ ) {
            System.out.printf("1~100 숫자 %d\n",i);
            int j = (int)(Math.random() * 8 + 2);
            System.out.printf("2~10 랜덤숫자 : %d\n",j);
            System.out.printf("결과 %d \n",i*j);
            // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
            //
            //    그 다음 루프에서 다시 작업을 반복한다.
            //
            //    끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?
            // 이부분이 잘이해가 되지 않습니다.

        }
    }
}
