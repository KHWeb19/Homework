public class work10 {
    public static void main(String[] args) {
        // 65~90까지의 난수와 97~122까지의 난수를 무작위로 생성해봅시다
        int dice1 = (int)(Math.random() * 26 + 65);
        int dice2 = (int)(Math.random() * 26 + 97);

        System.out.println("난수1 = " + dice1);
        System.out.println("난수2 = " + dice2);
    }
}
