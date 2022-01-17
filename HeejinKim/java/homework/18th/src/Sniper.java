
    public class Sniper extends Adventurer {

        final int SNIPER_BONUS = 500;


        final float SNIPER_MAJOR_COEF = 3.5f;
        final float SNIPER_MINOR_COEF = 1.5f;

        public Sniper () {
            super();

            sniperPromotionBonus();
        }

        public void sniperPromotionBonus () {
            pAtk += (SNIPER_BONUS * SNIPER_MAJOR_COEF);

            str += (MINOR * SNIPER_MINOR_COEF);
            con += (MINOR * SNIPER_MINOR_COEF);
            dex += (MAJOR * SNIPER_MAJOR_COEF);
            agi += (MAJOR * SNIPER_MAJOR_COEF);
            iq += MINOR;
            men += MINOR;
        }


        public int calcBurstShotDamage (DamageCalcRequestObject dcro) {
            return (int) (5 * (pAtk - dcro.getpDef()) *
                    ( (dex - dcro.getCon()) * 1.5 + (agi - dcro.getCon()) * 1.2) );
        }

        @Override
        public int qSkill(SelectedCharacter monsterSc) {
            dcro.procDamageCalcRequestObject(monsterSc);
            int damage = calcBurstShotDamage(dcro);

            System.out.printf("%10d - 버스트 샷(원거리)\n",
                    damage);

            return damage;
        }


    }


