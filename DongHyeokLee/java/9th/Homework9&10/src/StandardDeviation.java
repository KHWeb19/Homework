public class StandardDeviation {

    public void initsd(){
        Variance var = new Variance();

        var.initvar();

        //그에 반해 이와 같은 경우 sum 과 SUBJECT_NUM에 static이 붙지 않았는데 사용이 가능함
        // 왜 그런지 그 차이를 잘 모르겠습니다
        System.out.println("표준편차는" + Math.sqrt(var.sum / var.SUBJECT_NUM));


    }
}
