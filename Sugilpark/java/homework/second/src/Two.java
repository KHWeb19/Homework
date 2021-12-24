public class Two {
    public static void main(String[] args) {
        //정수형 변수 2개 만들기
        //*의문 = 정수형 변수를 랜덤으로 돌리려고 하는데 값이 0으로만 떨어짐
        //처음엔 (int)를 빼고 했는데 에러가 발생
        //그래서 (int) 추가 후 에러는 발생 하지 않음
        //최소값 지정 1로 하였지만 랜덤값 변함 없음
        int a1 = (int)(Math.random()+1);
        int a2 = (int)(Math.random()+1);

        //정수형 랜덤 숫자 출력
        System.out.println("정수형 a1 = " + a1);
        System.out.println("정수형 a2 = " + a2);

        //float 변수 2개 지정
        float b1 = (float) Math.random();
        float b2 = (float) Math.random();

        //float 변수 랜덤 숫자 출력
        System.out.println("float b1 = " + b1);
        System.out.println("float b2 = " + b2);

        //double 변수 2개 지정
        double c1 = Math.random();
        double c2 = Math.random();

        //double 변수 랜덤 숫자 출력
        System.out.println("double c2 = " + c1);
        System.out.println("double c2 = " + c2);

    }
}
