public class Homework10 {
    public static void main(String[] args) {

        // 65~122까지의 난수 생성 뒤, 65~90 또는 97~122에 해당하는 숫자 출력

        int rand = (int)(Math.random() * 58 + 65);

        if (rand >=65 && rand<=90 || rand >=97 && rand <=122) {
            System.out.println("rand = " + rand);
        }


        // && = and 연산자
        // || = or 연산자
    }
}
