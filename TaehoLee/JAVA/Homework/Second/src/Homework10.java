public class Homework10 {
    //65 ~ 122까지의 난수를 무작위로 생성하고 65 ~ 90 혹은 97 ~ 122에 해당하는 숫자만 출력해봅시다.

    public static void main(String[] args) {
        int num = (int)(Math.random() * 58) + 65;

        if (num > 91 && num < 97){
            ;
        }
            else{
                System.out.println(num);
            }
    }
}
