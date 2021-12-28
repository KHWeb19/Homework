public class Q4 {
    public static void main(String[] args) {
        //배열 30개를 선언한다
        //모든 학생들이 60점 미만이 없다고하니
        //final int를 이용해 MAX=100, MIN=61을 선언해준다
        //Math.random으로 61~100으로 최소 최대값을 정해준다
        //그리고 배열 30개에 랜덤으로 배치해준다
        //평균값을 구하기 위해 총점을 더해줄 ADD를 선언해준다
        //30개 배열의 평균값을 구해준다

        final int MAX = 100;
        final int MIN = 60;
        final int NUM = 30;
        int ADD = 0;

        int Class[] = new int[NUM];
        int Range = MAX-MIN+1;

        for(int i=0; i<NUM; i++){
            Class[i] = (int)(Math.random()*Range+MIN);;
            System.out.println(Class[i]);
            ADD += Class[i];
        }
            System.out.printf("평균 점수는:%d",ADD/NUM);


    }
}
