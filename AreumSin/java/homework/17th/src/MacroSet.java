public class MacroSet {

    final int SECOND = 2;
    final int THIRD = 3;

    public MacroSet(){
        System.out.println("매크로 시작");
    }
                            // Object 타입은 모든 데이터 타입을 받을 수 있음.
    public void doMacroSet(final int num, Object obj) throws InterruptedException {

        switch (num){
            case SECOND:
                System.out.println("나는 전사!");
                break;
            case THIRD:
                System.out.println("나는 법사");
                Wizard wiz1 = (Wizard) obj;
                // RolePlayingGame에서 만든
                // Wizard wiz = new Wizard();
                // 여기서 생성된 객체 wiz가 대입..? 입력된건가요?

                for(int i = 0; i< 3; i++){
                    wiz1.wSkill();
                }
                wiz1.qSkill();
                Thread.sleep(3000);
                break;
            default:
                System.out.println("다시해");
                break;

        }

    }

}
