public class MainClass {
    public static void main(String[] args) {

		GameMaganer gameManager = new GameMaganer(2);
    	gameManager.startGame();
    	
    	
    	gameManager.doYouWantMoreGame();
    }
}

/*
게임을 하나 만들어보자.
qSkill / wSkill 두개의 스킬을 만들고
캐릭터는 전사 /  마법사로 처리
여기서 모험가 -> 전사 -> 2차전직(전사)
모험가 -> 법사 -> 2차전지(법사) 당

일단, 클래스와 인터페이스가 어떻게 있어야하는지 알아보자.
1. 메인클래스(게임실행 객체 부르기)
2. 게임 실행 클래스(사용자객체할당) : playGame (startGame 작업하기
3. 사용자 클래스 ( 전사 / 법사 ->부르기 ) : 점수/ 레벨업/
3. 전사 클래스 warrior(q: 찌르기 / s : 난사)
4. 법사 클래스 wizard (q : 마법 주문 / s : 마법 회복)
5. 스킬 인터페이스 qskill / wskill -> 스킬은 같은 스킬이잖아 뭘 하는지가 다를뿐. 그래서 인터페이스 가능할듯


-> 모험가로 시작합니다 ( 기본 생성자일때)

인터페이스를 -> 스킬 / 직업
스킬 매소드 :

사용자 클래스에서 ~> startGame 안에 killmonster -> 하면 몬스터를 죽이는거야. 100이 될때까지
그러면 chooseYourJob 전사 혹은 법사 선택할 수 있음 -> 몬스터를 또 죽이는거야 100이 될때까지 for문사용 100 되면 for문 끝내기
100이 넘으면 upgradeYourJob (2차전직) 가능 ->

객체배열도 만들어보고 싶네
 */
