public class RandomTest {
    public static void main(String[] args) {
        //0부터 1미만
        double rand1 = Math.random();
        float rand2 = (float)Math.random();

        System.out.println("rand1=" + rand1);
        System.out.println("rand2=" + rand2);

        //0부터 6미만에 +1 -> 1부터 6까지
        int dice = (int)(Math.random() * 6 + 1);
        System.out.println("주사위 굴리기=" + dice);
    }
}
