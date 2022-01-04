public class M1Class {
    static int A = 1;
    static float B = 2.2f;
    static float C = 3.3f;
    static double D = 4.1, E = 5.1, F = 6.1;
    public void printNum() {
        System.out.println("정수 출력"+A);
        System.out.printf("실수입력 %f, %f\n", B,C);
        System.out.printf("실수입력 %f, %f, %f\n", D,E,F);
    }
}
