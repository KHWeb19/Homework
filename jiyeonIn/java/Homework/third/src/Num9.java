public class Num9 {
    public static void main(String[] args) {
        //9. 1~100까지의 숫자를 순회, 2~10 사이의 랜덤 숫자 선택, 숫자 배수 출력
        //다음 루프에서 다시 랜덤숫자 선택, 해당 숫자 배수 출력~ 다음작업 다시 반복
        //끝까지 순회했을때 출력된 숫자들의 합은 얼마인가?

        /*
        1.2~10사이 랜덤 숫자 선택
        2.for문 통해 1~100반복
        3.if문 통해서 배수 출력. -> if문 내의 배수를 합하기.
        3.다음 루프에서 랜덤숫자 선택 후 배수 출력 -> 즉 100번을 순회하려면 for문을 또 써야함
        4.그 값들의 합은? -> sum 사용// j 랜덤 값의 합 :sum1 // 1~100번 순환 시 발생되는 sum1을 더한 값 :sum2
        배수란. n 을 나눴을때 0이 되는 값?
         */

        final int MAX = 10;
        final int MIN = 2;

        int sum1 = 0;
        int sum2 = 0;

        for(int i= 1;i<=100;i++) {
           int rand =(int)(Math.random()*(MAX-MIN+1)+MIN);
            System.out.println("선택한 값 : "+rand);
            System.out.println(rand+"의 배수");

            sum1 =0;
            // sum1을 0으로 초기화시켜서 다시 값을 구해게 한다.
            // for문 안에 다시 초기화시키는걸 의도해서 sum1 =0값을 준건데, commit 하려고 하니 중복이라고 경고가 뜹니다.
            // 물론 작동은 하긴하지만, 문제가 있을까요?

            for(int j= 1;j<=100;j++) {
                if (j % rand == 0) {
                    System.out.print(j+",");
                    sum1+=j;

                }
            }
            sum2+=sum1;
            System.out.println();
            System.out.println("랜덤값 합 : "+sum1+"\n");

        }
        System.out.println("총 합 : "+sum2);

    }
}
