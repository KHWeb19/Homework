public class P1 {
    // 65 ~ 122 사이의 랜덤한 숫자 생성, 소문자나 대문자가 아니라면 다시 생성

    public static void main(String[] args) {
        int min = 65, max = 122;
        int rand;
        boolean text = false;

        while(!text){

            rand = (int)(Math.random() * (max - min + 1)) + min;

            if (rand <= 90 || rand >= 97){
            System.out.printf("문자 : %c", rand);
            text = true;
            }
        }
    }
}
