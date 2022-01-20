public class CardTest {
    public static void main(String[] args) {
        System.out.println("card.width = "+ Card.width);
        System.out.println("card.height = "+ Card.height);


        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 4;

        Card c2 = new Card();
        c2.kind = "Space";
        c2.number = 2;

        System.out.println("c1의 종류와 크기는"+ c1.kind+"  "+ c1.number);
        System.out.println("c2의 종류와 크기는"+ c2.kind+"  "+ c2.number);

        c1.kind = "Ssss";
        c2.kind = "Circle";

        c1.number = 100;
        c2.number = 200;

        System.out.println("c1의 종류와 크기는"+ c1.kind+"  "+ c1.number);
        System.out.println("c2의 종류와 크기는"+ c2.kind+"  "+ c2.number);


    }
}
