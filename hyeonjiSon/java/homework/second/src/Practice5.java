public class Practice5 {
    public static void main(String[] args) {
        //문제: double 변수 2개에 랜덤값을 할당하고 출력합니다.

        double rand1 = Math.random();
        double rand2 = (Math.random() * 3);
        //double은 소수점이 길게 나오니까 Math,random 앞에
        // 별도로 (변수타입)을 표시하지 않아도 괜찮은 건가?

        System.out.println("rand 1 = " + rand1);
        System.out.println("rand 2 = " + rand2);
    }
}
