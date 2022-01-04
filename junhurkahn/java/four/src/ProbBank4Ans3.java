public class ProbBank4Ans3 {
    public static void main(String[] args) {
        // 고양이 클래스를 만들어주세요.

        ///new mycat생성
        MyCat myCat = new MyCat();

        //그런데 왜 inin My Cat하고 simulation만 불러들었을까.
        // feed simulation 전부 불러들어야 되는것이 아닐까
        /* myCat.simulation2();....... 이렇게*/
        myCat.initMyCat(3,8.2f);
        myCat.simulation();
    }
}