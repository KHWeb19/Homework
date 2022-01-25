import java.util.Scanner;

public class Test {
   public void count(){

       Scanner sc = new Scanner(System.in);

       while(false){
           System.out.print("문자열을 입력해 주세요 : ");
           String str = sc.nextLine();
           if(str.equals("exit")){
               break;
           } else {
               System.out.println(str.length() + "글자 입니다.");
           }
       }
       System.out.println("프로그램을 종료합니다. ");
   }
}
