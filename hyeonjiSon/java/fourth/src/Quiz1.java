public class Quiz1 {
    public static void main(String[] args) {
        //Quiz3. if문제
        //       숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다!

        int num1 = 3;
        final int div = 2; //짝수
        final int remain = 0;

        if(num1 % div == remain){
            System.out.println(num1 + " ← 숫자가 짝수라면 이 지문이 출력된다.");
        } else{
            System.out.println(num1 + " ← 숫자가 홀수라면 이 지문이 출력된다.");
        }
    }
}
