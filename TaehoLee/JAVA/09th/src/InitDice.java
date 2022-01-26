public class InitDice {
    int range;
    int rand;
    int dice_max;
    int dice_min;

    public InitDice(int dice_max, int dice_min){
        this.dice_max = dice_max;
        this.dice_min = dice_min;
    }
    public void rollDice(){
        range = dice_max - dice_min + 1;
        rand = (int)(Math.random() * range) + 1;
    }
    public void printDice(){
        System.out.print("나온 주사위는 : " + rand);
    }

}
