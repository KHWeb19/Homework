public class P2 {
    // 피보나치 수열의 20번째 항

    public static void main(String[] args) {

        int num, num1, num2, count = 1;

        for(num = 1, num1 = 0, num2 = 0; count <= 20; count++) {
            if(count % 2 == 0) {
                num += num1;
                num1 = num;
            }
            else{
                num += num2;
                num2 = num;
            }
        }
        System.out.println("피보나치 20번째 수 : " + num);
    }
}