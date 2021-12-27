public class Homework10 {
    public static void main(String[] args) {
        //1~100까지 숫자를 순회
        //9번과 유사하게 2~10가지고 작업
        // 배수 찾기 x 랜덤한 숫자가 나온만큼만 이동하고 이동했을때 나온 숫자들의 합을 계산->1부터 이동인가
        //랜덤한 숫자만큼 이동해서 이걸 더하고 이게 100을 넘으면 안되는건가????


        final int MAX = 10, MIN = 2;
        final int START = 1 , END = 100; // 오호.. 범위가 달라지면 이것 고치면 되는구나
        int range = MAX - MIN + 1;
        int decision , sum = 0;



        for (int i = START; i <= END; i += decision) {


                decision= (int) (Math.random() * range + MIN);


            System.out.printf("뽑은 난수 = %d , 현재 위치 = %d\n", decision, i);



             sum += i;


        }


        System.out.printf("이동했을 때 나온 수 의 합 = %d\n", sum);

    }
}
