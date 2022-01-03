public class third1 {
    public static void main(String[] args) {
        int alpa = (int) (Math.random() * 58 + 65);

        if (91 <= alpa && alpa <= 96) {
            System.out.printf("특수문자를 출력하시오 : %c", alpa);
        } else {
            System.out.printf("알파벳을 출력하시오 : %c", alpa);
        }

    }
}



