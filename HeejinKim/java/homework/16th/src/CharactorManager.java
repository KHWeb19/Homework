import java.util.Scanner;

public class CharactorManager {//여기서는 캐릭터들의 배열을 만들어서 사용자가 많아지는 것(확장성)을 고려함


    final int PLAYER_NUM = 2;
    Scanner scan;
    Wizard wi;
    Warrior wa;
    //직접 전직을 입력하는 거랑 연결을 어떻게 시켜줘야 되는지
    //저 마법사 클래스랑 전체를 관리하는 거랑(manager)은 어떻게 연결시켜야 되는지
    //id 처리는 어떻게?
    //배열로 만들어서 game에서 관리는 어떻게?

    public CharactorManager() {

        scan = new Scanner(System.in);
        wi = new Wizard("해리포터", 20, 20, 20, 10, 20, 20);
        wa = new Warrior("해리포터", 20, 20, 10, 20, 20);
    }



    public boolean selectJob() {
        System.out.print("전직 1.전사 2.마법사\n번호를 입력하세요: ");

        while (true) {
            String select = scan.nextLine();
            for (int i = 0; i < PLAYER_NUM; i++) {

                if (select.equals("1")) {

                    System.out.println("전사로 전직합니다");
                    wi= new Wizard("해리포터",20,20,20,15,20,20);


                    return false;

                } else if (select.equals("2")) {

                    System.out.println("마법사로 전직합니다");

                    wa = new Warrior("해리포터", 20, 20, 10, 20, 20);
                    return false;
                }


            }
        }
    }
}

