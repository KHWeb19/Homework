public class Homework1 {
    public static void main(String[] args) {
        // 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.
        // 여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자
        int min = 65;
        int max = 122;

        int rand = (int)(Math.random()*(max - min +1) + min);

        if(rand>90 && rand<97){
            rand = (int)(Math.random()*(max - min +1) + min);
        }
        System.out.printf("%c\n", rand);
    }
}
