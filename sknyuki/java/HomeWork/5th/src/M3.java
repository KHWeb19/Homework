public class M3 {
    public static void main(String[] args) {
       /* //배열로 로또 문제를 만들어보기!
        //   실제 로또 확률은 0.00000023으로 1억명중 23명이 당첨됨
        //   실제값을 사용하기엔 검토 작업이 너무 고통스러우므로 100명 중 5명을 뽑아보도록 하자!
        //   배열값에 당첨되는 자리를 배치해놓고 사용자가 돌려서 당첨되는지 안되는지를 판정하도록 한다.

        // 100명중 랜덤으로 5개만 당첨되도록 프로그램형성?


        */
        final int TOTAL=100;
        final int SELECT=5;


        int[] lotto = new int[SELECT];
        for(int i=0; i< SELECT; i++){
                lotto[i]=(int)(Math.random()*TOTAL);


                for(int j=0; j<i; j++){
                    if(lotto[i]==lotto[j]){
                        //☆☆☆
                        // 질문 1.lotto.contains(lotto[j])는 못쓰나요?
                        //lotto[i]==lotto[j]에서 "=="를쓰면 1번항과 2번항의 중복은 막을수있지만 1번항과 3,4,5번항의 중복은 못 걸러내는거같아요.

                        //이 접근법도 유효한가요?
                        System.out.println("중복 발생!");
                        --j; //j가 i보다 -1상채를 유지하기위해
                        break;

                }

            }

            System.out.printf("당첨번호는 %d입니다\n",lotto[i]);
        }




    }
}