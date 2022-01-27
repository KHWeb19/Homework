public class MacroSet {

    final int THIRD = 3;

    public MacroSet(){
        System.out.println("매크로 시작");
    }

    public void doMacroSet(final int num,Object obj) throws InterruptedException {
        //어떤 Interrupted을 감지했으니까 이거를 빨리 예외처리해라
        //인터럽션은 예기치 못한 상황를 처리해주는게  throws InterruptedException
        // .스레드--인트럽트를 발생시킴.알람역할 알람. Interrupted를 발생시킴
        //인터럽트가 발생하면 무조건 그거먼저 처리함..그 역할 throws InterruptedException
        //그 발생한 알람에 대한 처리를 해줌.


        //오브젝트를 써서 객체를 넘기는데 이때 넘기는 객체는 wiz가 됨
        //이때 이 오브젝트는 법사의 기능들이 들어있음.
        //num에는 어떤 매크로를 돌릴지 판정해주는 부분
        //obj는 어떤 객체든지 타입 캐스팅을 통해 저런 처리가 가능해짐

        switch (num){
            case THIRD:
                System.out.println("지금부터 법사의 정해진 행동패턴을 구동함");

                Wizard wiz =(Wizard) obj;

               // for(int i=0;i<3;i++){ //w스킬은 3번
                    wiz.wSkill();
                //}
                wiz.qSkill();
                Thread.sleep(3000);
                break;
            default:
                System.out.println("없는 매크로 입니다!");
                break;
        }

       }

    }

