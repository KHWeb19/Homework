import java.util.Scanner;

public class IfRangData {
    public static void main(String[] args) {
        boolean checkNotFinish = true;

        Scanner scan = new Scanner(System.in);
        int num;

        //혼선을 최소화 하고자 한다면 가장 협소한 범주를 가장 위에 배치한다.
        //가장 넓은 범주는 최하위에 배치한다.
        while (checkNotFinish){
            System.out.printf("성적 입력 : ");
            num = scan.nextInt(); //입력란이 while 반복문 안에 만들어져 있으니까 계속해서 다음 수를 입력하라는 Scanner가 뜨는구나

            if(num >= 90 ){
                System.out.println("A등급");
            } else if(num >= 80 ){ // 90 > num >= 80
                System.out.println("B등급");
            } else if(num >= 70 ){
                System.out.println("C등급");
            } else if(num >= 60 ){
                System.out.println("D등급");
            } else{
                System.out.println("F라니...?");
            }



        }
    }
}
