public class P09 {
    public static void main(String[] args) {
        /*1 ~ 100까지의 숫자를 순회한다.
        2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        그 다음 루프에서 다시 작업을 반복한다.
        끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ? */


        int j = 0;
        int randNum;
        int minSelNum = 2;
        int maxSelNum = 10;
        int Range = maxSelNum - minSelNum + 1;
        int tempSum; // 선택된 숫자의 배수들의 합
        int totalSum = 0; // 출력된 모든 값들의 합


        while (j++<3) {
            System.out.printf("루프 %d 진입\n",j);
            tempSum = 0;
            randNum = (int) (Math.random() * Range + minSelNum);
            System.out.printf("선택된 숫자 : %d\n", randNum);

            for (int i = 1; i < 101; i++) {

                if (i % randNum == 0) {
                    System.out.printf("%d의 배수 = %d\n", randNum, i);
                    tempSum += i;
                    //System.out.println("현재까지 %d의 배수들의 합 = %d\n",randNum,tempSum);
                }
            }
            System.out.printf("1~100까지 %d의 배수들의 합 = %d\n", randNum, tempSum);
            totalSum += tempSum;
            System.out.printf("루프 %d 종료\n",j);

        }
        System.out.printf("출력된 숫자들의 합 = %d\n", totalSum);
    }
}