public class PR {
    public static void main(String[] args) {

        // 2. 정수형 변수 1개, float 변수 2개, double 변수 3개 값 출력
        System.out.println("\n2. 정수형 변수 1개, float 변수 2개, double 변수 3개 값 출력");

        int a=1;
        float b=  2.22222222f , c = 3.333333f;
        double d = 4.4444444, e = 5.555555, f = 6.666666;

        System.out.printf("정수형 변수: %d\n", a);
        System.out.printf("Float 변수: %f, %f\n", b,c);
        System.out.printf("Double 변수: %f, %f, %f\n", d,e,f);

        // 3. 정수형 변수 2개에 랜덤값을 할당하고 출력
        System.out.println("\n3. 정수형 변수 2개에 랜덤값을 할당하고 출력");
        int aa = (int) (Math.random() * 10);
        int bb = aa + 20;

        System.out.printf("랜덤값 0~9, 첫번째 변수: %d\n",aa);
        System.out.printf("랜덤값 20~29, 두번째 변수: %d\n", bb);

        // 4. float 변수 2개에 랜덤값 할당하고 출력
        System.out.println("\n4. float 변수 2개에 랜덤값 할당하고 출력");

        float g = (float) Math.random() * 10;
        float h = (float) Math.random();

        System.out.printf("랜덤값 0.000 ~ 9.999ㅡ 첫번째 변수: %f\n", g);
    }
}
