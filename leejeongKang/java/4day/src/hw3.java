import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 1;
        final int range = MAX - MIN +1;


        int [] arr = new int [MAX];
        arr[10]=2; arr[30]=2; arr[50]=2; arr[60]=2; arr[80] =2;
        arr[11]=2; arr[32]=2; arr[54]=2; arr[66]=2; arr[88] =2;
        arr[15]=2; arr[37]=2; arr[55]=2; arr[68]=2; arr[81] =2;

            int rand = (int)(Math.random()*range+MIN);
            System.out.println("로또 번호 : " + rand);
            if (arr[rand]==2){
                System.out.println("당첨입니다.");
            }
            else
                System.out.println("꽝입니다.");
        }




    }
