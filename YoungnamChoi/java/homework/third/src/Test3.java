public class Test3 {
    public static void main(String[] args) {
        //1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129, ...
        //   이와 같은 숫자의 규칙을 찾아 25번째 항을 구하도록 프로그램 해보자!

        // 규칙을 생각 해봤을 때 An의 항을 구할 때  An= A(n-1) + a(n-3) 항 임을 알 수가 있다.

        int num1=1;
        int num2=1;
        int num3=1;
        int num4;

        for(int i=4; i<26; i++){
            num4=num3+num1;
            System.out.println(num4);
            num1=num2;
            num2=num3;
            num3=num4;
        }


    }
}
