public class Practice3 {
    public static void main(String[] args) {
        //문제: 정수형 변수 2개에 랜덤값을 할당하고 출력합니다.
        int rand1 = (int)(Math.random() * 10);
        int rand2 = (int)(Math.random() * 100);

        //int rand3 = (int)Math.random();
        //디폴트가 0.0 ~ 1.0 미만이기 때문에
        // 범위를 따로 지정해주지 않는다면
        // 정수형에서는 숫자가 0으로만 출력...되는 것 같다!

        System.out.println("rand1 = " + rand1);
        System.out.println("rand2 = " + rand2);
       // System.out.println("rand3 = " + rand3);


    }
}
