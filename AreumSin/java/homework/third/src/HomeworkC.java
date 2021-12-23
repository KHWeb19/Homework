public class HomeworkC {
    public static void main(String[] args) {
        //3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //   이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        int num1 = 1, num2 = 1, num3 = 1;
        int res = 0;

        //System.out.println(num1+" "+num2+" "+num3);
        for (int i = 0, j = 4; i<8; i++){
            res = num1 + num3;
            System.out.println(j+"번째 수: "+res);
            num1 = res;
            j++;

            res += num2;
            System.out.println(j+"번째 수: "+res);
            num2 = res;
            j++;

            res = num3 + res;
            System.out.println(j+"번째 수: "+res);
            num3 = res;
            j++;
        }
    }
}
