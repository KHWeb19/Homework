import java.util.Scanner;

public class Num1 {
    //1. 2 by 2 이중 배열을 초기화해서 아무 값이나 넣어보세요.
    // 기초 매소드 : 2 / 2의 배열을 만든다 + 스캐너 만든다.
    // 값을 입력.
    private Scanner scan;
    private int [][] arrytwo;
    private int output;
    private int END = 2;
    int num;

    public void initArry(){
        scan = new Scanner(System.in);
        num = scan.nextInt();
        arrytwo  = new int [END][END];

    }
    public void show(){
        for(int i=0;i<END;i++){
            for(int j = 0; j<END;j++){
                initArry();
                arrytwo[i][j] = num;
                System.out.println(i+"번째"+j+"값 : " +num);
            }
        }
    }
}
