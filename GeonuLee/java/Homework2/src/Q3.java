public class Q3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int num4;



        System.out.printf("%d %d %d",num1,num2,num3);

        for(int i=0; i<25; i++){
            num4=num1+num3;
            System.out.print(" "+num4);
            num1=num2;
            num2=num3;
            num3=num4;

        }

    }
}
