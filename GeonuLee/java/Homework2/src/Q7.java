public class Q7 {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int count = 0;


        while(count<=100){
            count++;
            num++;

            if(num%4==0){
                num1+=num;


            }
        }
        System.out.printf("%d ",num1);
    }
}
