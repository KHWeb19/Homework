public class HW02 {
    public static void main(String[] args) {
        // 2. 배열을 사용하지 않고 1,1,2,3,5,8 피보나치 수열의 20번째 항을 구해보자

        int fib_a = 1, fib_b = 1;

        System.out.print("1, 1, ");
        for (int i=0; i<18; i++){
            int tmp = fib_a;
            fib_a = fib_a + fib_b;
            fib_b = tmp;
            if (i != 17) {
                System.out.printf("%d, ",fib_a);
            }
            else{
                System.out.printf("%d",fib_a);
            }
        }
    }
}
