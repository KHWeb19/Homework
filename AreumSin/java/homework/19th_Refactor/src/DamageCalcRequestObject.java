public class DamageCalcRequestObject {
    // 18주차는 fenryl만 공격했는데
    // 그걸 선택해준 몬스터로 알아서 정하기 위해서

    private float pAtk, mAtk;
    private float hp, mp;
    private float pDef, mDef;
    private float str, con, dex, agi, iq, men;

    public void procDamageCalcRequestObject (SelectedCharacter monsterSc) {
        switch (monsterSc.getSelectedNum()) {
            case MonsterNumber.FENRYL:
                procAllData((Fenryl) monsterSc.getCharacter());
                break;
        }
    }

    public void procAllData (Fenryl fenryl) {
        pAtk = fenryl.pAtk;
        mAtk = fenryl.mAtk;
        hp = fenryl.hp;
        mp = fenryl.mp;
        pDef = fenryl.pDef;
        mDef = fenryl.mDef;
        str = fenryl.str;
        con = fenryl.con;
        dex = fenryl.dex;
        agi = fenryl.agi;
        iq = fenryl.iq;
        men = fenryl.men;
    }

    public float getpAtk() {
        return pAtk;
    }

    public float getmAtk() {
        return mAtk;
    }

    public float getHp() {
        return hp;
    }

    public float getMp() {
        return mp;
    }

    public float getpDef() {
        return pDef;
    }

    public float getmDef() {
        return mDef;
    }

    public float getStr() {
        return str;
    }

    public float getCon() {
        return con;
    }

    public float getDex() {
        return dex;
    }

    public float getAgi() {
        return agi;
    }

    public float getIq() {
        return iq;
    }

    public float getMen() {
        return men;
    }
}
