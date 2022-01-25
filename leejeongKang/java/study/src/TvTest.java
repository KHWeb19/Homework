public class TvTest {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 12;
        t2.channel = 8;
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channelUp();
        t2.channelDown();
        System.out.println(t1.channel);
        System.out.println(t2.channel);


        Tv [] tvarr = new Tv[3];

        for (int i =0; i<tvarr.length; i++){
            tvarr [i].channel = i+10;
        }
    }
}
