public class M8Class {
    static int Min = 4;
    static int Max = 97;
    static int Random;

    public void printNum() {
        Random = (int) ((Math.random() * (Max - Min) + Min));

        System.out.println(Random);
    }
}