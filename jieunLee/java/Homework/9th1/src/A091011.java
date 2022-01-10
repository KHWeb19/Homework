public class A091011 {
    public static void main(String[] args) {
        Rand rand = new Rand();
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(4, 97));
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(65, 90));
        System.out.println("랜덤 숫자를 생성해보세요. "+rand.initRand(97, 122));
        rand.daesoRand();
    }
}
