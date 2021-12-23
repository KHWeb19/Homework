public class Quiz7 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i<=100; i++){
            if (i % 4 == 0){
                sum += i;
            }
        }
        System.out.println("1~100 사이의 4의 배수의 합은 " +sum);
    }
}
