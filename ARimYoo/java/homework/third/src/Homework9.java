public class Homework9 {
    public static void main(String[] args) {

        // 1 ~ 100까지의 숫자를 순회한다.
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.
        // 그 다음 루프에서 다시 작업을 반복한다.
        // 끝까지 순회 했을때 출력된 숫자들의 합은 얼마인가 ?

        int i = 1;
        int min = 2;
        int max = 11;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range + min);
        int sum = 0;

        while (i < 100) {

            i += 1;

            if (i % rand == 0) {

                System.out.println(rand + "의 배수 값 : " + i);
                sum += i;

            }

            }

            System.out.println("지금까지 순환된 배수 값들의 합 = " + sum);
        }
    }



