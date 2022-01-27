public class PrivateClassExample {
    public static void main(String[] args) {
        NonPrivateExampleClass npc = new NonPrivateExampleClass();

        npc.age = 10;
        npc.name = "이렇게 마음대로 바꾸기 가능함.";

        System.out.println(npc);
    }
}
