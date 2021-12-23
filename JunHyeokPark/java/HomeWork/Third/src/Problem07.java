public class Problem07 {
    public static void main(String[] args) {
        int i = 0; int sum = 0 ;
        while (i++ < 100) {
            if (i % 4 == 0) {
                  sum += i;

            }
        }
        System.out.println("1~100중 4의 배수의 합은 " +sum);
    }
}
