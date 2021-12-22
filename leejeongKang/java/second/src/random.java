public class random {
    public static void main(String[] args) {
        double r1 = Math.random();
        float r2 = (float)Math.random();

        System.out.println("rand1 ="+ r1);
        System.out.println("rand2 ="+ r2);

        int dice = (int)(Math.random() * 6 +1 );
        System.out.println("주사위 눈금 = "+ dice);
        //0.0~ 1.0 미만
        //0.0~ 6.0 미만 (5.99999), 소숫점 버리고 플러스 일 추가하면 1~6 나옴
    }
}
