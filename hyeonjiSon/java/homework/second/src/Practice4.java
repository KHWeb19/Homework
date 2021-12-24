public class Practice4 {
    public static void main(String[] args) {
        //문제: float 변수 2개에 랜덤값을 할당하고 출력합니다.

        float rand1 = (float)Math.random();
        float rand2 = (float)(Math.random() * 5);

        System.out.println("rand1 = " + rand1);
        System.out.println("rand2 = " + rand2);
    }
}
