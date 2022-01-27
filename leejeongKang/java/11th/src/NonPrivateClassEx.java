public class NonPrivateClassEx {
    public static void main(String[] args) {
        NonPirvateClass npc = new NonPirvateClass();

        npc.age = 20;
        npc.name = "메롱";
        System.out.println(npc);
    }
}