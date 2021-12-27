public class QnA2 {
    public static void main(String[] args) {

        /*
        1. 65~90 - 대문자   97~122 - 소문자 <아스키코드표 참조>
        2. 첫 for문은 대문자들 출력
        3. 두번째 for문은 소문자들만 출력
         */

        for (int i = 65; i <= 90; i++) {
            System.out.printf("대문자 ? %c(%d)\n", i, i);
        }

        System.out.println();

        for (int i = 97; i <= 122; i++) {
            System.out.printf("소문자 ? %c(%d)\n", i, i);
        }
    }
}
