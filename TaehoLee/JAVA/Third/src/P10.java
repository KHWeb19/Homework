public class P10 {
    // 1. 1 ~ 100 순회,
    // 2. 2 ~ 10 랜덤 숫자
    // 3. 랜덤한 숫자가 나온만큼 이동
    // 4. 출력된 숫자들의 합

    public static void main(String[] args) {
        int rand, num = 1;

        while(num <= 100){
            rand = (int)(Math.random() * 10) + 1;
            System.out.printf("현위치 : %d, 출력 값 : %d\n",num, rand);
            num += rand;
        }
        System.out.println("루프 숫자들의 합 : " + (num - 1));
    }
}
