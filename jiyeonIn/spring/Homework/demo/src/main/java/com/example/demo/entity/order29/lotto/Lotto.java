package com.example.demo.entity.order29.lotto;

public class Lotto {
    private int lottoNum;
    private int selectNum;
    private int random;
    private String[] peopleArr;
    //30명중에 어떤 값을 가졌는지 확인하는 최종 값
    private int[] selectArr;
    //누가 당첨된건지 확인하기 위한 배열

    public Lotto(int lottoNum,int selectNum){
        this.lottoNum = lottoNum;
        this.selectNum = selectNum;
        peopleArr = new String [lottoNum];
        selectArr = new int [selectNum];
    }

    public void calcRandom(){
        //랜덤번호 확인 후 selectArr에 값을 넣음 - 이후 o,x 확인 위해
        for(int i=0 ; i<selectNum;i++){
            do {
                random = (int)(Math.random()*lottoNum);
            }while(isDuplicate(i,random));
            selectArr[i] = random;
        }
    }

    public void findWinner() {
        //selectArr[1],[2] 뭐든간에 i와 같으면 당첨이므로 break를 해줘야 다음 값때문에 x가 나오지 않음.
        for(int i=0;i<lottoNum;i++) {
            for(int j=0;j<selectNum;j++) {
                if(selectArr[j]==i) {
                    peopleArr[i] = "o";
                    break;
                }else if(selectArr[j]!=i) {
                    peopleArr[i] = "x";
                }
            }
        }
    }

    public boolean isDuplicate(int cnt, int random) {
        //랜덤 중복검사 - 선생님 java 6th 풀이 답안 참고
        for(int i=0; i<cnt; i++) {
            if(selectArr[i] == random) {
                return true;
            }
        }
        return false;
    }


    public String drawLottoWinner(int number) {
        //controller for문에서 i 값이 들어갈때마다 배열의 값이 도출 될 것임.
        return peopleArr[number];
    }
}