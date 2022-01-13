import java.util.Scanner;

public class SelectClass {

    //배열 0번부터 각자 직접 직업명을 넣어서 초기화해주는게 맞나?
    //그럼 값은 뭐로 넣음?? 레벨??
    final int ADVENTURER = 0;
    final int WARRIOR = 1;
    final int WIZARD = 2;

    int classNum;
    Skill[] className;


    public SelectClass(final int classNum){
        this.classNum = classNum;

        className = new Skill[classNum];




    }

    //모든 플레이어 모험가 시작
    //초반 레벨 1
    //lv5는 직업선택
    /*Scanner sc = new Scanner(System.in);
    String className;
    int lv;

    public SelectClass(final String className){
        this.className = className;

        lv = 1;
        }

    public void changeClass(int lv){
        if(lv == 5){
            System.out.println("무엇으로 전직 하겠습니까?(wizard/warrior)");
            String className = sc.nextLine();
            System.out.println("현재 직업 = " + className);
        }

        }*/




    }


