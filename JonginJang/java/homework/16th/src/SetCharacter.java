import java.util.Scanner;

public class SetCharacter {
    int characterNum;
    private Character[] characters;
    private final int skillNum = 2;

    private int[] jobs;
    private final int warrior = 1;
    private final int magician = 2;
    Scanner scan = new Scanner(System.in);

    public SetCharacter(int characterNum){
        this.characterNum = characterNum;
        characters = new Character[characterNum];
        jobs = new int[characterNum];

        for(int i = 0; i < characterNum; i++){
            characters[i] = new Character(skillNum);
            System.out.printf("캐릭터%d이 생성되었습니다\n",i);
        }
    }

    public void setJob(){
            jobs[0] = warrior;
            jobs[1] = magician;
    }

    public void printSkill(){
        System.out.println("각 직업의 스킬정보를 출력합니다.");
        for(int i = 0; i < characterNum; i++){
            System.out.println("----------------------------------");
            if(jobs[i]==1){

                System.out.println("전사의 스킬정보");
            }
            else if(jobs[i]==2){
                System.out.println("마법사의 스킬정보");
            }
            characters[i].printSkill(jobs[i]);
            System.out.println("----------------------------------");
        }
    }


}
