public class Q10 {
    public static void main(String[] args) {

        //1 ~ 100까지의 숫자를 순회한다.
        //9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        //다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        //이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        //9번과 비슷한 풀이방식

        final int start = 1; final int end = 100;
        final int max = 10; final int min = 2;

        int range = max - min + 1;
        int decision = 0;
        int sum = 0;

        for (int i = start; i<=end; i+=decision) {
            decision = (int)(Math.random()*range+min);
            System.out.printf("난수 %d의 이동한 위치 = %d\n", decision, i);
            sum += i;
        }

        // 향상된 for문 - for (자료형 변수명 : 배열명) {문장}

        System.out.println("나온 숫자들의 합 = " + sum);
    }
}
