public class test2 {
    public static void main(String[] args) {
        int num1 = 1;
        float num2 = 3;
        float fnum3 = 5.5f;
        double num4 = 7;
        double fnum5 = 8.8;
        double fnum6 = 9.9;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("fnum3: " + fnum3);
        System.out.println("num4: " + num4);
        System.out.println("fnum5: " + fnum5);
        System.out.println("fnum6: " + fnum6);

        System.out.println("fnum3: " + num2);
        // fnum2 = 3.0(num1)
        System.out.println("num2: " + fnum3);
        // num1 = 5.5 (fnum2)
        // System.out.print 는 출력만 해주는것이기때문에
        // 문장내용이 맞았는지 틀렸는지와는 상관없이 출력을해줌.

    }
}
