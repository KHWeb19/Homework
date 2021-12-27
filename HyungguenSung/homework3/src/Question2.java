public class Question2 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3;

        for(int i=1; i <=18; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
    }
}
