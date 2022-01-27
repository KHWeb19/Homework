import java.util.Scanner;

public class GameMaganer{
	Player [] user;
	Scanner sc;
	String str;
	int Player_Num;
	
	public GameMaganer(int Player_Num) {
		System.out.println("게임을 시작합니다.당신은 모험가입니다.");
		this.Player_Num = Player_Num;
		user = new Player[Player_Num];

		for(int i=0;i<Player_Num;i++) {
			user[i] = new Player();
		}
	}
	
	public void startGame() {
		for(int i=0;i<Player_Num;i++) {
			user[i].fightMonster();
			user[i].chooseYourJob();
			user[i].findYourJob();
		}
	}
	
	public void restartGame() {
		for(int i=0;i<Player_Num;i++) {
			user[i].fightMonster();
			user[i].updateYourJob();
		}
	}
	
	public boolean doYouWantMoreGame() {

    	
    	while(true) {
			System.out.println("계속하시겠습니까? y/n");
			sc = new Scanner (System.in);
			str = sc.nextLine();

	    	if(str.equals("y")) {
	    		System.out.println("게임을 계속합니다.");
	    		restartGame();
	    		return false;
	    	}else if (str.equals("n")){
	    		System.out.println("게임을 종료합니다.");
	    		return false;
	    	}else {
	    		System.out.println("다시 입력해주세요");
	    		continue;
	    	}
    	
    	}
	}
}
