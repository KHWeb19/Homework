public class JavaQuiz10 {
    public static void main(String[] args) {

        int rand1 = (int)(Math.random()*26+65);
        int rand2 = (int)(Math.random()*26+97);

        System.out.println("65~90까지의 난수는 " +rand1);
        System.out.println("97~122까지의 난수는 " +rand2);
    }
}
