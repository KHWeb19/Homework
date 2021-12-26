public class Second {
    public static void main(String[] args) {
        int rand1 = (int) Math.random();
        int rand2=(int)Math.random();
        float rand3=(float)Math.random();
        float rand4=(float)Math.random();
        double rand5=Math.random();
        double rand6=Math.random();

        //정수형 랜덤값은 그냥 출력하게 되면 항상 0이 나옵니다.
        //그것때문에 노란색 느낌표가 뜨는것 같습니다.
        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);
        System.out.println(rand5);
        System.out.println(rand6);

    }
}
