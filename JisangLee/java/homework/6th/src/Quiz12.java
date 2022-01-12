public class Quiz12 {
    //int 변수 1개,float 변수 2개, double 변수 3개에 아무 값이나 할당하고 출력

    static int num1;
    static float num2;
    static float num3;
    static double num4;
    static double num5;
    static double num6;
    public static void initQuiz12(){

        num1 = 7;
        num2 = 3.14f;
        num3 = 6.72f;
        num4 = 2.34525;
        num5 = 37.34252;
        num6 = 764.3424;

        printQuiz12();
    }
    public static void printQuiz12(){
        System.out.println("int = "+ num1);
        System.out.println("float1 = "+ num2);
        System.out.println("float2 = "+ num3);
        System.out.println("double1 = "+ num4);
        System.out.println("double2 = "+ num5);
        System.out.println("double3 = "+ num6);
    }
}
