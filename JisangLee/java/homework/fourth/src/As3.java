public class As3 {
    //1,1,1,2,3,4,6,9,13,19,28,41,60,88,129...
    //규칙을 찾아 25번째의 항을 출력
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int sum = 0;

        final int START = 4;  //final 데이터형의 안에 변수는 무조건 대문자로 적어줘야 한다.
        final int END = 25;

        for(int i=START; i<=END; i++){
            sum = num1 + num3;
            num1 = num2;
            num2 = num3;
            num3 = sum;

            //4번째 항부터 전체 출력
            //System.out.printf("%d번째의 항: %d\n",i,sum);


            if(i==25){
                System.out.println("25번째의 항: " + sum);
            }


        }

    }
}

//  1    1    1     2      3      4    6    9    13
//num1 num2  num3  sum
//     num1  num2  num3   sum
//           num1  num2   num3   sum
