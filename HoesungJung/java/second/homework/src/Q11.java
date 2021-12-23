public class Q11 {
    public static void main(String[] args) {
        int inum = (int) (Math.random() * 57 + 65);
        if (inum <= 90) {
            System.out.println("출력1: " + inum);
        } else if (inum >= 97) {
            System.out.println("출력2: " + inum);
        } else {
            System.out.println("틀렸지?");
        }
    }
}
