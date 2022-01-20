public class Qestion2 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;

        for(int i = 3; i <=20; i++){

            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;

            if (i==20){
                System.out.println("20번째 항 : " +sum);
            }
        }
    }
}
