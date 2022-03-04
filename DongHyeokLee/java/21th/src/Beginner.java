public class Beginner {
    //스텟
    // str , con , dex ,luk , wis , int(iq)
    // hp , mp
    //pAttack , mAttack

    // 레벨업할 때마다 스텟 올라가야함
    //스킬
    // 데미지

    //경험치
    //사냥하면 경험치 올라가고 레벨업
        int lv;
        int str,dex,iq,con,luk,wis;
        int hp,mp,pAtk,mAtk;
        int curExp, resExp , getExp;

        //초기 레벨 1때의 값이라 final 사용한거 같음
        final int LEVEL = 1;

        final int STR = 5;
        final int DEX = 5;
        final int IQ = 5;
        final int CON = 5;
        final int LUK = 5;
        final int WIS = 5;

        final int HP = (con*20);
        final int MP = (wis*10);
        final int PATK = (str*2);
        final int MATK =  iq;



        public Beginner(){
            lv = LEVEL;

            str = STR;
            dex = DEX;
            iq = IQ;
            con = CON;
            luk = LUK;
            wis = WIS;

            hp = HP;
            mp = MP;
            pAtk = PATK;
            mAtk = MATK;

            resExp = 0;

        }


        //몹을 잡으면 경험치가 들어와야되고
        //경험치가 쌓이면 레벨업이 되어야 함
        //
        //경험치를 어떻게 들어오게 해야되지
        public void huntExp(){
            getExp += (int)(Math.random() * 20);

        }

        public void calcExp(){
            curExp += getExp;

            if(curExp >= resExp){
                lv++;
                curExp = curExp - resExp;
                statusUp();
                lvUpExp();

            }
        }

        public void lvUpExp() {
            for (int i = 0; i < lv; i++) {
                resExp += 100;
            }

            //레벨업 할때마다 스텟업함
            //레벨업 구현해야겠음
        }

        public void statusUp(){
            strUp();
            dexUp();
            iqUp();
            conUp();
            lukUp();
            wisUp();
        }


        public void strUp(){
            str++;
        }
        public void dexUp(){
            dex++;
        }
        public void iqUp(){
            iq++;
        }
        public void conUp(){
            con++;
        }
        public void lukUp(){
            luk++;
        }
        public void wisUp(){
            wis++;
        }


}
