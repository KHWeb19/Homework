public class HW8 {
    public static void main(String[] args) {

        int ran = (int) ((Math.random()) * 8) + 2; //2~10
        // int range = max - min + 1;

        for (int i = 1; i <= 100; i++) {
            if (i % ran == 0) {
                System.out.println(i);
            }


        }
    }
}