public class randomprint {
    private int MAX=100;
    private int MIN=10;
    int range;

    public int randomprintNum(){
        range=MAX-MIN+1;
       return (int)(Math.random()*range+MIN);
    }
}
