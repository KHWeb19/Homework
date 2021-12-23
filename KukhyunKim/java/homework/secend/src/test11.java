public class test11 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 57 +65);
        if (num1 <= 90) {
            System.out.println("num1 = " + num1);}
       /*

        else if (num1 >= 105) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 104) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 103) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 102) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 101) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 100) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 99) {
            System.out.println("num1 = " + num1);}
        else if (num1 >= 98) {
            System.out.println("num1 = " + num1);}

     Q1. elso if 명령문을 계속 여러개 사용하면 어떠한 문제가생기는지
     Q2. 아무문제가 없다면 몇개 까지 가능한지
        */
        else if (num1 >= 97) {
            System.out.println("num1 = " + num1);}
         else {
            System.out.println("해당하지않음");}
    }
}
