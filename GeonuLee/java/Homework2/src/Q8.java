public class Q8 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100+1);
        int num1=0;
        int count=0;

        num1=num;
        System.out.printf("%d\n",num1);

        while(count<9){
            count++;
            if((num>=2&&num<=10)&&(num%num1==0)){
                System.out.printf("%d ",num1*count);
            }
        }
    }
}
