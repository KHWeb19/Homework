public class MacroSet {

    final int SECOND = 2;
    final int THIRD = 3;

    public MacroSet () {
        System.out.println("매크로 구동 준비 완료!");
    }

    public void doMacroSet (final int num, Object obj) throws InterruptedException {

        switch (num) {
            case SECOND:
                System.out.println("지금부터 전사의 정해진 행동 패턴을 구동합니다!");
                Knight kni = (Knight) obj;
                break;

            case THIRD:
                System.out.println("지금부터 법사의 정해진 행동 패턴을 구동합니다!");
                Wizard wiz = (Wizard) obj;
                for (int i = 0; i < 3; i++) {
                    wiz.wSkill();
                }
                wiz.qSkill();
                Thread.sleep(3000);
                break;

            default:
                System.out.println("없는 매크로 입니다!");
                break;
        }
    }
}
