public class P10 {
    public static void main(String[] args) {
        /*1 ~ 100까지의 숫자를 순회한다.
        9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!*/



        int randNum;
        int minSelNum = 2;
        int maxSelNum = 10;
        int Range = maxSelNum - minSelNum + 1;
        int mNum;
        int sumNum = 0; // 선택된 숫자들의 합

        for (int i = 1; i < 101; i++) {

            randNum = (int) (Math.random() * Range + minSelNum);
            mNum = i + randNum;
            System.out.printf("현재 i값(%d)에서 선택된 숫자 %d만큼 이동합니다.->%d\n", i,randNum,mNum);
            sumNum += mNum;

        }
        System.out.printf("이동했을 때 나온 숫자들의 합 = %d\n", sumNum);

    }
}