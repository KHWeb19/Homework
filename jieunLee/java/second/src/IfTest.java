public class IfTest {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*10+3);

        if(rand%2==0){
            System.out.println(rand + ": 나는 짝수");
        } else {
            System.out.println(rand + ": 나는 홀수");
        }
    }
}
