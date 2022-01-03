public class LotteryDraw {

    PeopleRan ran = new PeopleRan();
        //일단 당첨번호랑 사람이 쥔 번호가 같으면 당첨
    public void draw(){

        ran.initRandom();

        //5개 모두 결과가 나오도록 해야함 당첨 하나가 발생시 멈춤
        //lottoIdx의 최종값에서 그값이 당첨되면 멈추는거같음
        //lottoIdx의 5개번호 다 당첨되도록해야함
        //lottoBox[lottoIdx]를 활용해야할듯

        for(int i = 0; i < LottoIdx.TOTAL; i++){
            //if(LottoIdx.lottoIdx == ran.people[i])
            if(LottoIdx.lottoBox[ran.people[i]] == true){
                System.out.println(i + "번 손님" + ran.people[i] + "번 당첨");
            }

        }
    }

}
