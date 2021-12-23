public class HW01 {
    public static void main(String[] args) {
        System.out.println("1. 65 ~ 122 사이의 랜덤한 문자를 생성하도록 한다.\n" +
                "여기서 소문자나 대문자가 아니라면 다시 생성하도록 프로그램을 만들어보자\n");
        int rand = (int)(Math.random()*58+65);
        if (rand>90 && rand<97) {
            rand = (int) (Math.random() * 58 + 65);
            //여기서도 소문자나 대문자가 안나오면..?
        }
        System.out.printf("%c\n", rand);
    }
}
