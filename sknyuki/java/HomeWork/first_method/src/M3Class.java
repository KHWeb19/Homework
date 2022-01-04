public class M3Class {
    static float Rand1;
    static float Rand2;

    public void printNum() {//무조건 0만 나와서 슬퍼요
        Rand1 = (float) (Math.random() * 100) + 1;
        Rand2 = (float) (Math.random() * 100) + 1;
        System.out.printf("첫번째 랜덤숫자 %f\n", Rand1);
        System.out.printf("두번쨰 랜덤 숫자 %f\n", Rand2);
    }
}
