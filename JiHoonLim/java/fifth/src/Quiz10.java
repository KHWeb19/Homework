public class Quiz10 {
    public static void main(String[] args) {
        /*
        1. 과일 배열 , 과일 개수 배열
        2. 사과[0]= 100원 귤[1]=200원 오렌지[2]=300원 수박[3]=400원 메론[4]=500원 포도[5]=600원
        질문
        이렇게 푸는게 맞는지 궁금합니다.
         */
        final int frunum = 6;
        int i,j;
        int sum =0;

        int [] fru= new int[frunum];
        int [] fnum = new int[frunum];
        int [] res = new int[frunum];

        for (i =0; i < frunum; i++){
            fru[i] = 100*(i+1);
        }

        fnum[0] = 5;
        fnum[1] = 3;
        fnum[2] = 5;
        fnum[3] = 2;
        fnum[4] = 3;
        fnum[5] = 4;

        for (j = 0; j < frunum; j++ ){
            res[j] = fnum[j] * fru[j];
            sum += res[j];
        }
        System.out.println("총 가격은 " +sum);
    }
}
