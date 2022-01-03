public class Hw7 {
    public static void main(String[] args) {
        // 1부터 100까지 숫자 중 4의 배수를 모두 더한 값
        // 4+8+12+16+......+96+100

        int sum = 0;

        for(int i = 1; i < 101; i++){
            if(i % 4 == 0){
                sum += i;
            }
        }
        System.out.println("4의 배수의 합 : " + sum);
    }
}
