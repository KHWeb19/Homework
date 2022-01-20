public class Area2 {

    //1.잘게 잘라준다 갯수파악해서---x의 좌표에 하나씩 넣어야 y값이 나옴
    //2.0.001+ 0.001 이 될것임 (x좌표는 0.001의 핪으로 3까지 가야함)...배열로 [x,y]좌표를 만들어야하나
    //3.여기서 쓰레드는 나눠진 갯수까지 더하는 것을 만들어줌---x좌표를 만들어줌
    //4.for문 돌려서 y좌표도 만들어서 합

   // private double yArr[];
   // public static double[] xArr;
   public static double divide;


    public Area2(){

       calDivide();
    }

    public int calDivide(){

        divide=(AreaThread2.getWidth() / AreaThread2.getSlice());

        return (int)divide;
    }


      // run을 돌릴땐 괜찮지만 start에 문제가 있으면 크리티컬 섹션에 문제
      // run이 이상하면 코드 잘못만들었다.

 }














