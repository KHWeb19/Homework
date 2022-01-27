public class second1 {
    public static void main(String[] args) {
        //과제 2번 ~ 5번
        int a, a2;
        float f1, f2;
        double d1, d2, d3;
        a = 3;
        f1 = 3.18756f;
        f2 = 5.9085f;
        d1 = 7.84563;
        d2 = 9.678;
        System.out.printf("<과제 2번> 변수를 출력하시오 : %d, %f, %f, %f, %f\n", a, f1, f2, d1, d2);

        a = (int)(Math.random()*99 + 1);
        a2 = (int)(Math.random()*99 + 1);
        f1 = (float)Math.random();
        f2 = (float)Math.random();
        d1 = Math.random();
        d2 = Math.random();
        d3 = Math.random();
        System.out.printf("<과제 3번> 정수형 랜덤 출력 : %d, %d\n", a, a2);
        System.out.printf("<과제 4번> float형 랜덤 출력 : %f, %f\n", f1, f2);
        System.out.printf("<과제 5번> double형 랜덤 출력 : %f, %f, %f\n", d1, d2, d3);

    }
}
