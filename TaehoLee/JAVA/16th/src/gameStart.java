public class gameStart {
    public static void main(String[] args) {
        Player player = new Player("Amadis");
        System.out.println(player);
        GameMaster GM = new GameMaster();
        GM.fight();
    }
}
