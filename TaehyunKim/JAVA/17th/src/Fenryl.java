public class Fenryl extends Adventurer{
    final float PATK = 50;
    final float MATK = 50;
    final float HP = 1000000000;
    final float MP = 100;
    final float PDEF = 1150;
    final float MDEF = 1150;
    final int STR = 10;
    final int CON = 900;
    final int DEX = 10;
    final int AGI = 1000;
    final int IQ = 10;
    final int MEN = 900;

    public Fenryl () {
        pAtk = PATK;
        mAtk = MATK;
        iq = IQ;
        mp = MP;
        str = STR;
        dex = DEX;

        hp = HP;
        pDef = PDEF;
        mDef = MDEF;
        con = CON;
        agi = AGI;
        men = MEN;
    }
    public boolean isDead () {
        if (hp <= 0) {
            return true;
        } else {
            return false;
        }
    }
    public void raidTurnStart (CharacterManager cm) {

        SelectedCharacter sc;
        SelectedCharacter monsterSc = new SelectedCharacter(MonsterNumber.FENRYL, this);

        for (int i = 0; i < cm.memberSize(); i++) {
            sc = cm.getMemberArrayList().get(i);

            switch (sc.getSelectedNum()) {
                case CharacterNumber.KNIGHT:
                    hp -= ((Knight) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.WIZARD:
                    hp -= ((Wizard) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.SNIPER:
                    hp -= ((Sniper) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.HOLYKING:
                    hp -= ((HolyKing) sc.getCharacter()).qSkill(monsterSc);
                    break;
                case CharacterNumber.ASSASSIN:
                    hp -= ((Assassin) sc.getCharacter()).qSkill(monsterSc);
                    break;
            }
        }
    }
}
