public class FloatDoublePrint {
    public static void main(String[] args) {
        float fnum1 = 303f;
        double fnum2 = 7.7;
        //float은 숫자에 f를 붙여 float 타입임을 명시
        System.out.println("fnum1:"+fnum1);
        System.out.println("fnum2:"+fnum2);

        System.out.printf("타입 필요-fnum1:%f\n",fnum1);
        System.out.printf("타입 필요-fnum2:%f\n",fnum2);

        System.out.printf("이것도 가능-fnum1=%.2f\n",fnum1);
    }
}
//변수란?
//특정한 데이터타입의 정보를 저장할 수 있는 데이터 공간-C언어
//특정한 데이터타입의 정보를 저장할 수 있는 공간-Java

//float가 성능은 높지만, double이 정밀도가 높다.