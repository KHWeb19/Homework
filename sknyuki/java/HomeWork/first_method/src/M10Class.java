public class M10Class {
    int Max = 122;
    int Min = 65;
    int Random;

    public void printNum() {
        Random = (int) ((Math.random() * (Max - Min)) + Min);
        boolean A = 65 <= Random && Random <= 90;
        boolean B = 97 <= Random && Random <= 122;
        if (A || B) {
            System.out.printf("조건에 만족하는 랜덤 숫자는%d입니다.", Random);
        }
    }
}