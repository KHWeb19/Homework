public class test3 {
    public static void main(String[] args) {
        // int random = (int)(Math.random() * 10000000000 + 1); <-에러
        // Q1. int명령어가 1,000,000,000이하만되는 이유가
        // 10,000,000,000 부터는 에러가나는 이유는 숫자가 길어서라는데
        // int명령어는32바이트까지 할당가능해서가 맞나요?
        // Q2. 긴 숫자를 할때는 float, double 처럼 int 보다 더긴숫자를 할당가능한
        // 명령어가 어떤게있나요?

        int random1 = (int)(Math.random() * 1 + 1);
        int random2 = (int)(Math.random() * 100 + 1);
        // BigInteger random3 = (BigInteger)(Math.random() * 100000000000000000000 +1);
        // Q3. biginteger로는 정수형 표현이 안되나요? 코딩한게 틀렸는지 확인부탁드립니다.


        // 랜덤한 정수형 변수 출력
        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
        //System.out.println("random3 = " + random3);
    }
}
