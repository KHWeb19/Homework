public class Homework1 {
        public static void main(String[] args) {

            // 65 ~ 122 사이의 랜덤한 문자를 생성.
            // 소문자나 대문자가 아니라면 다시 생성

            int min = 65;
            int max = 122;
            int range = max - min + 1;

            int rand = (int)(Math.random() * range + min);


            if (rand >= 65 && rand <=90 || rand >=97 && rand <=122){

                System.out.printf("rand = %c", rand);

            } if (rand >= 91 && rand <=96) {

                rand = (int)(Math.random() * range + min);
                System.out.printf("rand = %c", rand);

            }
        }
    }
