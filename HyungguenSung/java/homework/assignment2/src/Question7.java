public class Question7 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <=100; i++ ){
            if(i % 4 == 0){
            sum +=i;
            }
        }
        System.out.printf("더한 값 : %d\n", sum);
    }
}
