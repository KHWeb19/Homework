public class RandomTest {
    public static void main(String[] args) {
        //랜덤을 만드는 방법
        double rand1 = Math.random();
        float rand2 = (float)Math.random();

        // double은 소수점이 길게나옴
        System.out.println("rand1 = " + rand1);
        // float은 표현할 수 있는 자리수가 적어서 소수점이 짧게 나옴
        System.out.println("rand2 = " + rand2);

        int dice = (int)(Math.random() * 6+1);
        System.out.println("주사의 눈금 = " + dice);
    }
}
