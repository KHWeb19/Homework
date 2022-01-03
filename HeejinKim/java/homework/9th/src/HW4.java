public class HW4 {
    //1번 문제를 클래스화 해봅시다
    public static void main(String[] args) {
        /*
        int[][] score = new int[][]{{10, 20, 30},{40, 50, 60},{70, 80, 90}};
        HW4Class scoreNew= new HW4Class(score); //직접 값을 입력해주어서 그것을 바로 배열에 적용시킴
        */

        HW4Class [][] scoreNew = new HW4Class[3][3];

        HW4Class printScore = new  HW4Class();
        //HW4클래스에 printScore라는 객체를 생성해줌
        //scoreNew라는 객체는 배열이랗 하기가 힘들어서 다른 객체를 생성해줌
        //원래는 배열 자체를 가져오고 싶었음.
        // 그래서  scoreNew.printScore()라는 것만 HW4 클래스에서 부르면 배열이 나오는 식으로...


        System.out.printf("scoreNew[%d][%d]=%d\n", HW4Class.i,HW4Class.j, printScore.getScore());
    }
}




