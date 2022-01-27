public class Homework2 {
    public static void main(String[] args) {

        int num = 3;
        float fnum1 = 3.3f , fnum2 = 4.44f;
        //double 형에 정수 5를 넣어도 작동하는데 잘못된건가요? 정수일때는 무조건 int형에 넣어야하나요
        //double형에 int형과 같이 정수가 들어간다면 double형과 float형을 비교했을때 성능과 정확성의 차이라고했는데 이경우에도 그런가요?
        // 성능 = 속도?? 정확성= 자릿수?? ->  printf 일때는 3.333000 으로나오고 println일때는 3.333으로 나오는데 이것도 성능?차이가 있을까요
        double dnum1 = 3.333 , dnum2 = 2.222222222 , dnum3 = 5;

        System.out.println("num = " + num);
        System.out.printf("fnum1 = %f , fnum2 = %f\n" , fnum1, fnum2);
        System.out.printf("dnum1 = %f , dnum2 = %f , dnum3 = %f\n" , dnum1 , dnum2, dnum3);
        System.out.println("dnum1 = " + dnum1 + " dnum2 =" + dnum2 + " dnum3 =" + dnum3);
    }
}
