public class HW07 {
    public static void main(String[] args) {
        // 7. 1~100까지 숫자중 4의 배수를 더한 결과

        int result = 0;

        for (int i =1; i<= 100; i++){
            if (i % 4 ==0){
                result += i;
            }
        }

        System.out.println("1~100까지의 숫자중 4의 배수를 더한 결과: " + result);
    }
}
