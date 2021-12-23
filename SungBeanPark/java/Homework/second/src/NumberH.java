public class NumberH {
    public static void main(String[] args) {
        System.out.println("4~97까지 랜덤 숫자를 생성해보세요.");

        int dice44 = (int)(Math.random() * 100 - 3);
        if (dice44 > 3) {
            System.out.println("dice44 = " + dice44);
        }
    }
}
