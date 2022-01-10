class Q1 {
    public static void main(String[] args) {
       //doubleArr 클래스 불러오기
        doubleArr darr;
       darr = new doubleArr();
       //변수 값 설정
       darr.num1=2;
       darr.num2=2;
        //배열 생성
       int [][] arr = new int [darr.num1][darr.num2];

       //변수 값 만큼 도는 루프 생성
       for(int i=0;i<darr.num1;i++){
           //두번째 변수 값 만큼 도는 루프 생성
           for(int j=0;j<darr.num2;j++){
               //가로 한 줄 출력
               System.out.printf("[%d]",arr[i][j]);
           }
           //한 줄 띄어서 다시 돌아감.(변수값까지 출력)
           System.out.println();
       }
    }
}
//이중 배열 클래스 생성
public class doubleArr{
    // 사용할 변수 객체화
    int num1;
    int num2;
}





