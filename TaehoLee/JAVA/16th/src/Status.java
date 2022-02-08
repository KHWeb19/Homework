public class Status {

    // 기초스텟
    int gStr; ///물리데미지 관련
    int gCon; /// 체력, 방어력 관련
    int gDex; /// 공격속도, 크리티컬율, 명중률 관련
    int gAgi; /// 회피 관련
    int gWis; /// 마나, 마법 방어력 관련
    int gInt; /// 마법 공격력, 마법 크리티컬 관련

    // 계산 스텟
    int curHp; // 현제 체력
    int curMp; // 현제 마나
    int hp; // 풀 체력
    int mp // 풀 마나
    int pAtk; // 물리 공격력
    int mAtk; // 마법 공격력
    int pPen; // 물리 관통력
    int mPen; // 마법 관통력
    int pDef; // 물리 방어력 ---
    int mDef; // 마법 방어력
    int pCrit; // 물리 크리티컬율
    int mcrit; // 마법 크리티컬율 --- 0 ~ 100% ---- rand를 던져서 crit 값 이하이면, 데미지의 critDamage만큼의 배수를 곱하여 반환
    int critDamage; // 크리티컬 데미지(계수) --- 크리율 100퍼 이상시 크뎀증
    int Evade; // 회피율
    int Accurate; // 명중률 ----- // rand를 던져서 값이 accurate - evade 이하이면 명중 이상이면 회피 (acc - evad 값은 최대 100 최소 0)
    int atkSpd; // 공격 속도 -- 1턴(최대 100)당 공격속도만큼 증가, 최대값 도달시 공격 후 최대값만큼 줄임, 계속 반복

    //직업계수

    //데미지 타입

}
