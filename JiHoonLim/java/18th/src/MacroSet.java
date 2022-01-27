public class MacroSet {
    //전사 매크로
    final int SECOND = 2;
    //법사 매크로
    final int THIRD = 3;

    public MacroSet(){
        System.out.println("매크로 구동 준비 완료");
    }


    /*
    public void doMacroSet(final int num, Object obj) throws InterruptedException {

        //받은 obj 의 값으로 전사로 법사로 할지 처리하도록 만든다

        switch (num){
            case SECOND: //전사
                System.out.println("지금부터 전사매크로를 구동합니다.");
                Warroad warroad = (Warroad) obj;
                break;

            case THIRD: //마법사
                System.out.println("지금부터 마법사매크로를 구동합니다.");
                Sorceress sor = (Sorceress) obj;
                for (int i = 0; i < 3; i++) {
                    sor.wSkill();
                }
                sor.qSkill();

                Thread.sleep(3000); //3초
                break;

            default:
                System.out.println("없는 매크로 입니다.");
                break;
        }
    } */
}
