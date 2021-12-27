public class RandomTest {
    public static void main(String[] args) {
        //랜덤만드는 방법
        double rand1 = Math.random();
        float rand2 = (float) Math.random();

        //double은 소수점이 더 길게 나옴.
        System.out.println("rand1 = " + rand1); //rand1 = 0.6578791312139072

        // float는 표현할 수 있는 자리수가 적어 소수점이 더 짧게 나옴.
        System.out.println("rand2 = " + rand2); //rand2 = 0.88910055

        // Math random 자체가 0.0 ~ 1.0 미만의 수에서 랜덤으로 나타남.
        // 0.0 ~ 6.0 미만 5.xxx 인데 소수점을 버림 -> 0~5까지만 나옴
        // +1을 할 경우 1~6
        int dice = (int)(Math.random() * 6 +1);
        System.out.println("주사위 눈굼 = " + dice);
    }
}
