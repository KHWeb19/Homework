public class Homework9 {
    public static void main(String[] args) {
        // 65~90, 97~122까지의 난수 지정할 때
        // 아래와 같이 숫자를 입력해도 되나? 더 나은 방법 있을듯..
        int rand1 = (int)(Math.random() * 26 + 65);
        int rand2 = (int)(Math.random() * 26 + 97);

        System.out.println("rand1 = " + rand1 );
        System.out.println("rand2 = " + rand2 );
    }
}
