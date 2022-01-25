public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(2,2,0.001);
        Thread thread = new Thread(square);
        thread.start();
    }
}
