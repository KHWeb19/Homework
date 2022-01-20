public class Homework10 {
    public static void main(String[] args) {

        final int MAX1 = 90, MIN1 = 65;
        final int MAX2 = 122, MIN2 = 97;

        int range1 = MAX1 - MIN1 +1;
        int range2 = MAX2 - MIN2 +1;

     //int ran1 = (int)(Math.random()*26+65);
     //int ran2 = (int)(Math.random()*26+97);
        int ran1 = (int)(Math.random()*range1+MIN1);
        int ran2 = (int)(Math.random()*range2+MIN2);

        System.out.println("ran 1 = " + ran1);
        System.out.println("ran 2 = " + ran2);
    }
}
