public class Test1 {
    public static void main(String[] args) {
        // 2. 배열을 사용하지 않고 1,1,2,3,5,8 피보나치 수열의 20번째 항을 구해보자

        //65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        //
        //   여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자

        boolean num1 = true;

        while (num1) {
            int rand1 = (int) (Math.random() * 58 + 65);

            if (rand1 >= 65 && rand1 <= 90) {
                System.out.printf("%c\n", rand1);
                num1=false;
            } else if (rand1 >= 97 && rand1 <= 122) {
                System.out.printf("%c\n", rand1);
                num1=false;
            } else {
                System.out.println("다시생성 하세요");

            }

        }
    }
}

/*
boolean 값을 지정하고 그 값음 while문의 조건으로 사용을 한다.
while문으로 순회를 다시 도는 실행 역할을 한다.
 */
