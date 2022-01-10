public class M2Class {
    static int Rand1;
    static int Rand2;

    public void printNum() {//무조건 0만 나와서 슬퍼요
        Rand1= (int)(Math.random() * 100) +1;
        Rand2=(int)(Math.random()*100)+1;
        System.out.printf("첫번째 랜덤숫자 %d\n", Rand1);
        System.out.printf("두번쨰 랜덤 숫자 %d\n", Rand2);
    }
}
