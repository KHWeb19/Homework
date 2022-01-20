public class Hw4 {
    //구구단 7단 출력
    public static void main(String[] args) {
        System.out.println("구구단 7단");
     int dan=7,i=0,num;
     while(i++<9){
         num = dan * i;
         System.out.printf("%d x %d = %d\n",dan,i,num);
        }
    }
}
