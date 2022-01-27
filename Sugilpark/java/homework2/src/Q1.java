public class Q1 {
    public static void main(String[] args) {

        int max = 122;
        int min = 65;
        int rand1 = (int) ((Math.random() * max - min + 1) + 65);;

        boolean num1 = rand1>=65 && rand1<=90;
        boolean num2 = rand1>=97 && rand1<=122;

        System.out.printf("%c\n", rand1);

        while (!num1 && !num2) {
            int rand2 = (int) ((Math.random() * max - min + 1) + 65);
            if(rand2>=65 && rand2<=90 || rand2>=97 && rand2<=122){
                System.out.printf("%c\n", rand2);
                break;
            }
        }
    }
}
