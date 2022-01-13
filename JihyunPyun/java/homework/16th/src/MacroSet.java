public class MacroSet {
    // 전사
    final int SECOND = 2;
    // 법사
    final int THIRD = 3;

    public MacroSet(){
        System.out.println("매크로 구동 준비!");
    }

//    object!! 모든 데이터 타입 수용 가능
    public void doMacroSet(final int num, Object obj) throws InterruptedException {
        switch (num) {
            case SECOND:
                System.out.println("전사 매크로 구동");
                Knight kn = (Knight) obj;
                break;
            case THIRD:
                System.out.println("마법사 매크로 구동");
                Wizard wiz = (Wizard) obj;
                for (int i = 0; i < 2; i++) {
                    wiz.wSkill();
                }
                wiz.qSkill();
                Thread.sleep(3000); //3초 일시정지!!! (예외 발생함)
                break;
            default:
                System.out.println("없는 매크로에요");
                break;
        }

    }

}
