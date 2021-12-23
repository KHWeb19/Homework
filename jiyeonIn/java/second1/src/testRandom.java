public class testRandom {
    public static void main(String[] args) {

        double rand1 = Math.random();
        float rand2 = (float)Math.random();
        int rand3 = (int)(Math.random());


        System.out.println("rand1 = " + rand1);

        System.out.println("rand2 = " + rand2);

        System.out.printf("rand3 = %d\n ",rand3);


        int dice = (int)(Math.random() * 6 + 1);
        System.out.println("주사위 눈금 = " + dice);
    }
}