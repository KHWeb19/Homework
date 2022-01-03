import java.util.Scanner;

public class Student {

   // 6.학생 클래스에 수학, 영어, 국어 점수를 입력 받도록 개조합니다.
   // 7.학생 클래스의 평균을 계산해봅시다.

   private Scanner scan;
    int subScore1;
    int subScore2;
    int subScore3;
    double average;
    double disperse;

    public void setScore(){
        scan = new Scanner(System.in);
       subject();
   }
   public void subject(){
       System.out.println("수학,영어,국어 점수를 입력하세요");
        subScore1 = scan.nextInt();
        subScore2 = scan.nextInt();
        subScore3 = scan.nextInt();
       System.out.printf("수학=%d\n영어=%d\n국어=%d\n",subScore1,subScore2,subScore3);
   }
   public double average(){
       average=(double)(subScore1+subScore2+subScore3)/3;
       return average;
    }
    public double disperse(){
      average();
        //분산=제곱의 평균-평균의 제곱
        disperse=((((Math.pow(subScore1,2)+Math.pow(subScore2,2)+Math.pow(subScore3,2))/3))-(Math.pow(average,2)));
        return disperse;
   }
   public double stand(){
        return (Math.sqrt(disperse));
   }

}


