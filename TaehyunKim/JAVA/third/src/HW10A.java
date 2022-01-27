public class HW10A {
    // 10. 9번과 유사하게 2~10사이의 값을 가지고 1~100까지 순환
    // 하지만 랜덤한 숫자가 나온만큼 이동. 그리고 이동했을때 나온 숫자들의 합을 계산

    public static void main(String[] args) {
        final int MIN = 2;
        final int MAX = 10;
        final int RANGE = MAX - MIN + 1;

        int result = 0, i = 1;

        while (i<100){
            int movingDistance = (int) (Math.random() * 9 + 2);

            i += movingDistance;

            System.out.printf("추첨된 값은 %d입니다. 현재 위치: %d\n", movingDistance, i);

            result += i;
        }
        System.out.println("\n모든 이동이 끝났습니다. 이동했을때 나온 숫자들의 합: " + result);
    }
}
