public class test11 {
    public static void main(String[] args) {
       /*
       int max = 122;
       int min = 65;
       int random = (int)((Math.random()*(max-min))+min);

       boolean a = 65 <= random && random <= 90;
       boolean b = 97 <= random && random <= 122;
       if(aㅣㅣb){System.out.printf("조건에 만족하는 랜덤 숫자는%d입니다.", random)};
        */
        int num1 = (int)(Math.random() * 58 +65);
        if (num1 <= 90) {
            System.out.println("num1 = " + num1);}
       /*
        else if (num1 >= 100) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 99) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 98) {
            System.out.println("num1 = " + num1);}

     Q1. elso if 명령문을 계속 여러개 사용하면 어떠한 문제가생기는지?
     Q2. 아무문제가 없다면 몇개 까지 가능한지?
        */
        else if (num1 >= 97) {
            System.out.println("num1 = " + num1);}
         else {
            System.out.println("해당하지않음");}
    }
}
