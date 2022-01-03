import java.util.Scanner;
public class IfRangeData {
    public static void main(String[] args) {
        boolean checkNotFinish = true;
        Scanner sc = new Scanner(System.in);
        int num;

        while(checkNotFinish){
            System.out.println("성적 입력:");
            num = sc.nextInt();

            if(num>=90){
                System.out.println("A");}
            else if(num>=80){
                System.out.println("B");}
            else if(num>=70){
                System.out.println("C");}
            else if(num>=60){
                System.out.println("D");}
            else{
                System.out.println("F");}


            }
        }
    }

