import java.util.Scanner;

public class Player{ // 유저 (직업 / 스킬 / 레벨업)
	final int MAX = 5;
	final int MIN =1;
	int range;
	int rand; 
	int sum;
	Scanner scan;
	Worrior worrior;
	Wizard wizard;
	int job;
	
	
	public Player() {
		System.out.println("당신의 레벨은 0입니다. 몬스터를 죽이십시오.");
		range = MAX - MIN +1;
		scan = new Scanner(System.in);
	}
	
	
	public void fightMonster() {
		sum =0;
		
		for(int i=0;i<100;i+=rand) {
			rand = (int)(Math.random()*range+MIN);
			sum +=rand;
			System.out.println("몬스터를 죽였습니다. +"+rand+", 현재 점수 :"+sum);
		}
	}


	public void chooseYourJob() {
		if(sum >=100) {
			System.out.print("100 점 이상을 받았습니다. 직업을 선택 할 수 있습니다. 1.전사, 2.법사");
			job = scan.nextInt();
		}
	}

	public boolean findYourJob() { // 1이냐 2이냐에 따라 직업 . 스킬이 달라진다. 이걸 어떻게 표현할까?
		while(true) {
			if(job == 1) {
				worrior = new Worrior();
				return false;
			}else if(job ==2) {
				wizard = new Wizard();
				return false;
			}else {
				System.out.println("다시 선택하세요");
				continue;
			}
		}
		
	}


	public void updateYourJob() {
		if(sum>=100) {
			System.out.println("2차 전직 가능!!");
		}
		
	}

}
