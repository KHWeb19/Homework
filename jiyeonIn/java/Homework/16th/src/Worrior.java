public class Worrior  implements Job {
	
	public Worrior() {
		chooseJob();
		qSkill();
		sSkill();
	}
	
	@Override
	public void chooseJob() {
		System.out.println("당신은 전사입니다.");
	}

	@Override
	public void qSkill() {
		System.out.println("Q스킬은 = 찌르기");
		
	}
	
	@Override
	public void sSkill() {
		System.out.println("S스킬은 = 난사");
		
	}
	
}
