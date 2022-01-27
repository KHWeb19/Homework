public class Test4 {
    public static void main(String[] args) {

        //구구단 7단 출력

        int i = 0;

        while (i < 63) {
            i++;

            if (i % 7 == 0) {
                System.out.printf("구구단 7단 %d\n", i);
            }
        }
    }
}
