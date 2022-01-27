import java.util.Scanner;

public class Job{
    protected String job;
    Scanner scan;
    Level player = new Level();
    int level = player.level;

    public void initJob(){
        job = "Adventurer";
    }


    public boolean checkInput(){
        while(true){
            int isSelect = scan.nextInt();
            boolean isRight = (isSelect == 1) || (isSelect == 2);
            if(isRight == true){
                return false;
            }
            else if(isRight == false){
                System.out.println("1 또는 2를 선택해주세요.");
                return true;
            }
        }
    }

    public void selectJob(){
        scan = new Scanner(System.in);
        int selectJob;

        if (level  == 10){
            do {
                System.out.println("직업을 선택해주세요!(1 또는 2 선택)");
                System.out.println("1. Warrior , 2. Wizard");
                selectJob = scan.nextInt();;
            }
            while(checkInput());

            switch(selectJob){
                case 1 :
                    System.out.println("Warrior를 선택하셨습니다.");
                    job = "Warrior";
                    break;
                case 2 :
                    System.out.println("Wizzard를 선택하셨습니다.");
                    job = "Wizzard";
                    break;
            }
        }
    }
}
