public class Homework10 {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 58 + 65);

        // && 안쓰고 출력할 방법이 있나?
        if (dice > 90 && dice < 97){

        } else {
            System.out.println("dice = " + dice);
        }
    }
}
