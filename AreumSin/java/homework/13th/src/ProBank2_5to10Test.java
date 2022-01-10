public class ProBank2_5to10Test {
    public static void main(String[] args) {
        SequenceGenerator sc = new SequenceGenerator();

        sc.initSeq(1, 100);
        sc.evenNum( 3);

        sc.findNumAdd(4);

        System.out.println("1111111");
        sc.numTravel(2, 10);

        System.out.println("2222222");
        sc.numTravelNine(2, 10);
    }
}
