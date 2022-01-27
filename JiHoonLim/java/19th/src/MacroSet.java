import java.util.ArrayList;

public class MacroSet {

    public MacroSet(){
        System.out.println("매크로 구동 준비 완료");
    }


    public void doMacroSet(CharacterManager cm) throws InterruptedException {
        ArrayList<SelectedCharacter> member = cm.getMemberArrayList();

        SelectedCharacter usersc;
        SelectedCharacter monstersc = new SelectedCharacter(MonsterNumber.FIELD,fa);

        for (int i = 0; i < member.size(); i ++){
            usersc = member.get(i);

            switch (usersc.getSelectNum()){
                case CharacterNumber.WARROAD:

                    break;
            }
        }
    }
}
