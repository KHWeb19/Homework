public class eleven {
    public static void main(String[] args) {
        int ran = (int)(Math.random() * 58 + 65);
        if (65 <= ran) {
            if (ran <= 90) {
                System.out.println(ran);
            }
        }
        if (97 <= ran) {
            if (ran <= 122) {
                System.out.println(ran);
            }
        }
    }

    //실행했을때는 잘 나오지만 모든 경우의 수를 볼 수 없으니 잘 맞는지 모르겠다.
}
