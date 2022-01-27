public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 3.3f;
        double fnum2 = 7.7;

        System.out.println("요런게 편해요 - fnum1: " + fnum1);
        System.out.println("요런게 편해요 - fnum2: " + fnum2);

        System.out.printf("얜 타입을 알아야함 - fnum1: %f\n", fnum1);
        System.out.printf("얜 타입을 알아야함 - fnum2: %f\n", fnum2);

        System.out.println("하지만 요런식으로 정밀 제어가 가능함");
        System.out.printf("얜 타입을 알아야함 - fnum1: %.2f\n", fnum1);
    }
}
