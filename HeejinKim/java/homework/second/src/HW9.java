public class HW9 {
    public static void main(String[] args) {

        //range를 설정해서 하는 방법
        int min = 4;
        int max = 97;
        int range = max - min + 1;
        int r1 = (int) (Math.random() * (range) )+ min;
        //곱하기(4~97사이의 개수)+최소값의 설정

        System.out.println(r1);

        /* int r2 = (int) (Math.random());
           if (4 <= r2 && r2 <= 97)
            System.out.println(r2);
            여기서 if를 쓰면 97이상과 4이하의 수들이 출력되지 않음.*/




    }
}