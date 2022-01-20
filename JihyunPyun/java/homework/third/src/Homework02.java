public class Homework02 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3;

        for (int i = 3; ;i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if(i == 20){
                System.out.println(i + "번째 값 : " +num3);
                break;
            }
        }
    }
}
