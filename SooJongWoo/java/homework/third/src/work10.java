public class work10 {
    public static void main(String[] args) {
        // 1~100까지의 숫자를 순회한다
        // 9번과 유사하게 2~10을 가지고 작업을 진행한다
        // 다만 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!
        int sum = 0;
        for (int num = 1; num <=100; num++){
            int rand = (int) (Math.random() * 9 + 2);

            if (num % rand == 0) {
                sum += num;
            }
        }
        System.out.println("랜덤값 합 = " + sum);
    }
}
