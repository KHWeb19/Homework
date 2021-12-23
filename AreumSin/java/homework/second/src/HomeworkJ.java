public class HomeworkJ {
    public static void main(String[] args) {
        // 65 ~ 122 까지 난수를 무작위로 생성하고
        // 65 ~ 90 혹은 87~ 122에 해당하는 숫자만 출력

        int num = (int)(Math.random()*58 + 65);

        if (num<=90 ){
            System.out.println(num+"은 65~90에 해당");
        }

        if (num >= 87){
            System.out.println(num+"은 87~122에 해당");
        }

    }
}
