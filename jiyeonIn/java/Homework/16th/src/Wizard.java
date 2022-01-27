public class Wizard implements Job {

	public Wizard(){
		chooseJob();
		qSkill();
		sSkill();
	}
	
	@Override
	public void chooseJob() {
		System.out.println("당신은 법사입니다.");
	}

	@Override
	public void qSkill() {
		System.out.println("Q스킬은 = 익스펙토 패트로놈");
		
	}
	
	@Override
	public void sSkill() {
		System.out.println("S스킬은 = 아바다 케다브라");
		
	}
	
}
