public class Run {
    public static void main(String[] args) {
        User user = new User();

        user.initUser("sustka46", "89019");
        user.initUser("sustka46", "89019", "손현지", "주소", "000-0000", 'F');

        System.out.println(user.printUser1());
        System.out.println(user.printUser2());
        System.out.println(user.toString());
    }

}
