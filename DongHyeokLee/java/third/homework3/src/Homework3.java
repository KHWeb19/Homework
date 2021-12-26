public class Homework3 {
    public static void main(String[] args) {
       //1,1,1,2,3,4,6,9,13,19,28,41,60,88,129...
        //25번째 항을 구하라..

        int sum = 0; //초기화?
        int i= 1;//1번쨰 항??
        int j =1;//2번째 항
        int p =1;//3번째 항
        System.out.println("수열 1번째 항 = " + i);
        System.out.println("수열 2번째 항 = " + j);
        System.out.println("수열 3번째 항 = " + p);


        //뭔가 느낌이 if문으로 왔다갔다 더해야할거같음

        for(int order = 4; order <= 25; order++){

           if(order % 3 == 1 ) {
               sum = i+p;
            System.out.println("수열" +  order  + "번째 항 = " + sum);

            i = sum;
           }
           if(order % 3 == 2){
               sum = j+sum;
            System.out.println("수열" +  order  + "번째 항 = " + sum);

             j= sum;
           }
           if(order % 3 == 0){
               sum = p+sum;
            System.out.println("수열" +  order  + "번째 항 = " + sum);

            p = sum;
           }



        }





    }

}
