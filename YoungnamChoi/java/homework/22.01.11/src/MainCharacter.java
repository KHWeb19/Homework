public class MainCharacter {
    public static void main(String[] args) {
        Character character= new Character();
        character.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        character.upgradeLevel(aLevel);
        character.play(2);

        AdvancedLevel2 aLvel2 = new AdvancedLevel2();
        character.upgradeLevel(aLvel2);
        character.play(3);

        /*
        1.메인 클래스에서 게임을 실행하도록 구현하자
        2.어떻게 상속을 받아야 하나 생각을 해봤을 때
           캐릭터가 레벨이 오름에 따라 스킬을 다르게 해야 하고
           캐릭터는 기본 q와 w스킬만 가지고 있기 때문에 기본 캐릭타와 캐릭터가 레벨의 클래스를 구분해준다.
         3. 캐릭터의 레벨이 모험가나 전직등을 상속 할 수 있다고 생각해  레벨의 클래스를 세분화 했습니다.
         4.직업을 분히 해야 하는데 시작은 모험가로 동일하게 시작을 하지만
           전직 후에 직업이 분리가 되는 부분을 어떻게 하면 좋을 지 모르겠습니다.

         5.현재 구현한 스킬은 그냥 공통의 스킬을 쓴다 이런 느낌인데 직업별로 스킬을 어떻게 다르게 해야 할지 잘 모르겠습니다.


         */
    }
}
