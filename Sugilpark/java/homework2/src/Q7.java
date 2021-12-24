public class Q7 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        while (num3<100){
            num1++;
            num3++;
            if(num1 % 4==0){
                num2+=num1;
            }
        }
        System.out.println(num2);
    }
}
