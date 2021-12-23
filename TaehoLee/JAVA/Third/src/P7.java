public class P7 {
    // 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력
    public static void main(String[] args) {
        int sum = 0, num;

        for (num = 1; num <= 100; num++){
            if(num % 4 == 0){
                sum += num;
            }
        }
        System.out.println("4의 배수의 합" + sum);
    }
}