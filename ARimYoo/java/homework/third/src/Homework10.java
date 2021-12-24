public class Homework10 {
    public static void main(String[] args) {

        // 1 ~ 100까지의 숫자를 순회한다.
        // 9번과 유사하게 2 ~ 10을 가지고 작업을 진행한다.
        // 다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!


        // --> 2~10 중 랜덤으로 나온 숫자 n을 범위에 (1+n ~ 100+n)로 더해 이 범위의 모든 값을 더하는 것으로 이해했는데 맞나요..?

        int i = 0;
        int min = 2;
        int max = 10;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range + min);

        int sum;
        int sum2 = 0;

        while (i < 100) {

            i++;

            sum = i + rand;


            sum2+=sum;

            System.out.printf("%d가(이) %d만큼 이동 : %d\n", i, rand ,sum);


        }

        System.out.printf("%d만큼 이동한 값의 총 합 : %d\n", rand, sum2);






    }


}
