public class Num10 {
    public static void main(String[] args) {
        //10.65~90까지의 난수와 97~122까지 무작위 생성

        int num1 = (int)(Math.random()*26+65);
        int num2 = (int)(Math.random()*26+97);

        System.out.printf("num1=%d\nnum2=%d",num1,num2);
    }
}
