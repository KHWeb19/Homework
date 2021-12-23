public class WhileTest {
    public static void main(String[] args) {
        boolean isEven = false;
        int num = 1;

        while(!isEven){ // ture일때
            num += (int)(Math.random()*2 +1); //1or2

            if(num % 2 == 0){// 짝수일경우에
                isEven=true; // 안끝내!
            }

            System.out.println("num = "+num);
        }

        // 참고할 부분
        // +=, -=, *=, /=, %=
        // x += y ===> x = x + y
        // x -= y ===> x = x - y
        // x *= y ===> x = x * y
        // x /= y ===> x = x / y
        // x %= y ===> x = x % y
    }
}
