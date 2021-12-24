public class Five {
    public static void main(String[] args) {

        //(Math.random() * (최대값-최소값-1) + 최소값
        //65~90까지의 난수
        int a = (int)(Math.random() * 26 + 65);
        //(Math.random() * (최대값-최소값-1) + 최소값
        //97~122까지의 난수
        int b = (int)(Math.random() * 26 + 97);

        //a값 출력
        System.out.println("65~90까지의 난수 값은? "+ a);
        //b값 출력
        System.out.println("97~122까지의 난수 값은? "+ b);
    }
}
