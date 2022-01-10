public class Quiz2 {

    int num1;
    float fnum1 , fnum2;
    double dnum1, dnum2, dnum3;

        public void initQuiz2(){
            num1 = 1;
            fnum1 = 2f ;
            fnum2 = 3f ;
            dnum1 = 4;
            dnum2 = 5;
            dnum3= 6;

            printQuiz2();
        }
        public void printQuiz2(){
            System.out.println("정수는 " +num1);
            System.out.println("float형 실수는 " +fnum1+" 와 " +fnum2);
            System.out.println("double형 실수는 " +dnum1+" 와 " +dnum2+" 와 " +dnum3);
        }
}
