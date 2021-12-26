public class Homework2 {
    public static void main(String[] args) {
        //1 ,1 , 2 , 3 ,5 ,8 ,13,21,34,55,89...
        //일명 피보나치 수열의 20번째 항을 구하도록 프로그래밍
        //어찌합니까~~

        int MAX = 25;// Q. 이렇게 지정하면 몇번째 항까지 구할떄 이것만 변경해서 더 좋을라나?? 그럼 final 붙여야하나??
        int sum ; // 초기화 선언 안해도 됌
        int i= 0;//0번쨰 항??
        int j =1;//1번째 항


        //20번 반복..
        // 계속 노트에 끄적대서 찾아냈는데 개발자들도 답이 안나오면 노트에 끄적이는가?..
        // 첫번째 항은 어떻게 하지..
        System.out.println("피보나치 수열1번째 항 =" + j);

        //for(int order = 2; order <= 20; order++){
            for(int order = 2; order <= MAX; order++){

                sum = i+j;
                System.out.println("피보나치 수열" +  order  + "번째 항 =" + sum);

                i = j;
                j = sum;

            }
    }
}








