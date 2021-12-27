public class Question1 {
    public static void main(String[] args) {
        int min = 65;
        int max = 122;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range + min);

        if (rand >= 65 && rand <= 90 || rand >= 97 && rand <= 122) {

            System.out.printf("rand = %c ", rand);

        } else {
            rand = (int)(Math.random() * range + min);
            System.out.printf("rand = %c", rand);

        }
    }
}
