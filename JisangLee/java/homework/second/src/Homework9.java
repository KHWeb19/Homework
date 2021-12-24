public class Homework9 {
    //난수 65 ~ 90,  난수 97 ~ 122
    public static void main(String[] args) {
        double rand = Math.random();
        int randnum1 = (int)(Math.random()*26+65);
        int randnum2 = (int)(Math.random()*26+97);
        System.out.println("난수1 = " + randnum1);
        System.out.println("난수2 = " + randnum2);
    }
}
