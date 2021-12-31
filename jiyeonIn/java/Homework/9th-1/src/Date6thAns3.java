import java.util.Scanner;

public class Date6thAns3 {
    static int maxNum = 5;

    static int[] selectedLotto;

    private int max = 100;
    private int min = 1;
    private int range;
    private int random;


    public int random(){
        range = max - min + 1;
        random = (int)(Math.random()*range+min);
        return random;
    }
    public void randomArry(){
        selectedLotto = new int[maxNum];
    }

    public void playRandom(){
        for (int i = 0; i < maxNum; i++) {
        selectedLotto[i] = random();
        System.out.printf("당첨 번호: %d\n", selectedLotto[i]);
    }
}
}
