public class Homework10 {
    public static void main(String[] args) {
        // 1 ~ 100까지의 숫자를 순회한다.
        // 9 번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        // 다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을 때 나온 숫자들의 합을 계산하도록 만들어보자
        int sum1 = 0;
        int sum2 = 0;
        int min = 2;
        int max = 10;
        int rand = (int)(Math.random()* (max - min + 1) + min);
        System.out.println("랜덤숫자 = " + rand);

        for (int i = 1;  i<= 100; i++) {{
                sum1 += rand;
                sum2 += sum1;
                System.out.println("이동: " + sum1);
            }
        }
        System.out.println("합 = " + sum2);
    }
}
