public class Num11 {
    public static void main(String[] args) {
        //11.65~122난수 무작위 생성, 65~90, 혹은 97~122숫자만 출력

        int num1 = (int) (Math.random()*58+65);

        if(num1>=65 && num1 <=90 || num1>=97 && num1<=122){
            System.out.println(num1);
        }
    }
}
