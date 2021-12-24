public class Homework3 {
    public static void main(String[] args) {
        // 3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 88, 129 ,,,
        // 이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!
        int a = 0;
        int b = 0;
        int c = 1;
        int d;

        /*
      for(int i = 1; i< 25;  i++ ){
             System.out.println("i = " + a );
            d=a+c;
            a=b;
            b=c;
            c=d;
        }System.out.println("i 25 = " + a );

         */

        for (int i = 1; i < 25; i++) {
            d = a + c;
            a = b;
            b = c;
            c = d;
            // System.out.println("i = " + b);
            if (i == 24) {
                System.out.println("25번째 항 =" + c);


            }
        }
    }
}
