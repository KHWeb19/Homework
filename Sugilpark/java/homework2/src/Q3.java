public class Q3 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int num4;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        for(int i = 1; i<24; i++){
            num4=num1+num3;
            System.out.println(num4);
            num1 = num2;
            num2 = num3;
            num3 = num4;

        }
    }
}
