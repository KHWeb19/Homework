public class QnA4 {
    public static void main(String[] args) {


        byte limit = (byte) 0xff;
        System.out.printf("byte limit: 0x%x\n", limit);
        System.out.format("0x%x%n", limit);

        for (int i = 0; i < 8; i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.print(" ");
            }

            System.out.print(((0x80 >>> i) & limit) == 0 ? '0' : '1');
        }

        System.out.println();

        short test = (short) 0x0fff;

        System.out.printf("short limit: 0x%x\n", test);
        System.out.format("0x%x%n", test);

        for (int i = 0; i < 16; i++) {
            if (i != 0 && i % 4 == 0) {
                System.out.print(" ");
            }

            System.out.print(((0x8000 >>> i) & test) == 0 ? '0' : '1');
        }

        System.out.println();

        System.out.println("short test 2^12(4096) - 1: " + test);
    }
}