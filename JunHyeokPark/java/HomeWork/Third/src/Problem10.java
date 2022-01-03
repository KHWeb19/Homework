public class Problem10 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            int rand = (int) (Math.random() * 9 + 2);
            System.out.printf("랜덤 숫자는 %d 입니다.\n", rand);
            i += rand;
            //while 문 도중 i의 값이 100을 초과해버리는 경우에도 합해버리는 경우가 발생
            //그 경우를 막기위해 if문을 하나 더 사용
            if (i <= 100) {
                sum += i;
                System.out.printf("랜덤 숫자만큼 이동한 값은 %d 입니다.\n", i);
            }
        }
        System.out.printf("이동한 값들의 합은 %d 입니다.", sum);
    }
}

