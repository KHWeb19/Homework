public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();

        /*
        private이기 때문.

        pc.age = 10;
        pc.name = "왜 안돼?";
         */

        pc.setPersonInfo(10, "이건 된당!");

        System.out.println(pc);
    }
}
