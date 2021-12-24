public class Hw10 {
    public static void main(String[] args) {
        int min = 2;
        int max = 10;
        int range = (max - min) + 1;
        int rand = (int)(Math.random() * range + min);

        int sum1 = 0;

        for(int i=1; i <=100 ; i++){
            // 문제가 잘 이해가 안된다.
            // 랜덤한 숫자만큼 이동한다는게
            // 8이 나오면 8만큼 이동하고 다음루프에 7이 나오면 7만큼 이동해서
            // 도합 15만큼 이동했다 <<이 값을 계산하라는 뜻인가
            int sum2 = rand + i;

            System.out.println("이동한 값 : " + sum2);

            sum1 += sum2;

        }
        System.out.println("숫자들의 합 : " + sum1);
    }
}
