public class Homework01 {
    public static void main(String[] args){
        final int MIN1 = 65;
        final int MAX1 = 122;
        int range = MAX1 - MIN1 + 1;

        while(true){
            char random = (char) (Math.random() * range + MIN1); // 65 ~ 122 사이의 랜덤한 문자를 생성
            if (90 >= random || 97 <= random) {  // 대소문자만 출력
                System.out.println(random);
                break;
            }
        }
    }
}
