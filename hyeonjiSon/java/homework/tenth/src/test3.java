public class test3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = ++x; // z = 11
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        //z변수의 값을 새로 정해줌
        z = y++; // z =11
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        x = 20; //x변수의 값을 새로 정해줌
        z = x++ + --y; // z = 20 + (11이었던 y에서 -1을 한)10 = 30
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        int m = 20;
        int n = m++ + m;
        System.out.printf("m = %d, n = %d%n", m, n);
    }
}
