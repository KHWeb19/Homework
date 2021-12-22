public class BasicOperatorTest {
    public static void main(String[] args) {
        int num1 = 7, num2 = 3;

        int res = num1 + num2;
        System.out.printf("%d+%d = %d\n",num1,num2,res);

        res = num1-num2;
        System.out.printf("%d-%d = %d\n",num1,num2,res);

        res = num1*num2;
        System.out.printf("%d*%d = %d\n",num1,num2,res);

        res = num1/num2;
        System.out.printf("%d/%d = %d\n",num1,num2,res);

        res = num1%num2;
        System.out.printf("%d %c %d=%d\n",num1,37,num2,res);
        System.out.printf("%d %% %d = %d\n",num1,num2,res);

        //실제 영문자는 아스키코드로 구성
        //아스키코드는 숫자와 1대1로 대응
        //37이라는 아스키코드는 문자%에 대응
        //%c라는 문자를 출력하는 format을 배치하고
        //37을 배치하여 %를 출력
        //%c는 3과 7을 의미

        //Q. 아스키코드 37의 숫자 순서의 의미
        //A. int num 순서의 의미가 아니라 자판상 %의 아스키코드가 37임.
    }
}
