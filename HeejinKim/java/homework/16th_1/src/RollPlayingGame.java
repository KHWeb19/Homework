public class RollPlayingGame extends MacroSet{//이 게임 전체를 총괄함
    Wizard wiz;
    final int THIRD =3;
    final int MAX = 10000;
    final int MIN = 100;
    int range;

    public RollPlayingGame(){

        wiz=new Wizard();
        range = MAX - MIN + 1;
    }

    public void gameStart() throws InterruptedException {

        while(true){//매크로 작업을 해줌
            doMacroSet(THIRD,wiz);
            wiz.calCharExp(calExps(),THIRD);
            wiz.printInfo();//3초가 지나면 알람이 발생됨 그래서 interrup을 발생시킴 가장 우선순위로해야되는게
                            //저   interrup 발생되면 무조건 그것을 먼저 처리해야함--interruted 3초후에 알람이 발생하는 데 그거 자체가 인터럽스이다


       }
    }
    public int calExps(){
        return (int)(Math.random()*range+MIN);
    }

}
