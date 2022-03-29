public class test2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = ++x; // z = 11
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        z = y++; // x 11 y11 z 10 (위 값에서 하는게 아닌 전체 xyz로 확인해야함)
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        x = 20;
        y=10;
        z=11;
        z = x++ + --y; // 20 + 9 z 30 x 21 y 10
        //z = 20 + 9 = 29
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);

        int m = 20;
        int n = m++ + m; //21+20
        System.out.printf("m = %d, n = %d%n", m, n);
    }
}
