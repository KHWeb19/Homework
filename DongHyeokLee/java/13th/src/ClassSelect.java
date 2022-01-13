public class ClassSelect {
    //이건 아닌듯

   /* // 클래스 처음엔 모두 모험가 시작
    // lv30 달성 직업선택 lv50 2차전직
    // 그럼 플레이어 id가 들어와야되고
    // 그 아이디가 그냥 갈리는걸로 해야되나??

    final int MAX_LEVEL = 99;
    final int MIN_LEVEL = 1;

    private String id;
    private String className;

    int experience = 0;
    int lv = 1;
    boolean checkLv = true;

    int[] lvUpExperience;

    public ClassSelect(String id){
        this.id = id;

    }

    //음... 레벨따라 경험치 셋팅
    public void lvSetting(){
         lvUpExperience = new int[MAX_LEVEL];

        for(int i  = MIN_LEVEL;  i < MAX_LEVEL; i++ ){
            lvUpExperience[i] = i*100;

        }

    }

    //사냥해서 경험치 얻으면 레벨업하는 시스템 만들고 싶음
    //그럼 몇 경험치에 몇 레벨인지 설정해야되나??
    //사냥 경험치 얻는건 어떻게 설정 해야지..?
    //몹 한마리 잡을때마다 경험치??
    //능력 이상의것을 하려고하니 진행이 안됨
    //근데 헌팅과 경험치도 결국엔 다른 클래스로 나누어야할거같음
    //적을수록 양이 늘어남...

    public void hunting(){

        //레벨에 따른 최대경험치 획득량에 제한을 두고싶음
        int huntingExp = (int)(Math.random() * lv + 1);
        System.out.printf("경험치를 %d 얻었습니다.\n" , huntingExp);
        experience += huntingExp;


        public void checkLv(){
            for(int i = MIN_LEVEL; i < MAX_LEVEL; i++) {
                if (lvUpExperience[i] == experience) {
                    lv += 1;
                    System.out.println("레벨업 하였습니다.");
                    System.out.println("레벨 = " + lv);
                    experience = 0;
                } else if (lv == 5) {
                    checkLv = false;
                }
            }
        }
    }

    public void selectClass(){
        if(lv == 30){
            System.out.println("직업을 선택 하시오 : ");
        }
    }*/
}
