import java.util.Scanner;

public class Eat {


    private Scanner scan;
    static String select;

    public void catEat(){

        scan = new Scanner(System.in);

        System.out.print("고양이에게 밥을 주시 겠습니까?(Y/N)");
            select = scan.nextLine();

    }

}
