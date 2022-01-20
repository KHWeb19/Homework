public class Question1 {
    public static void main(String[] args) {
        int min = 65;
        int max = 122;
        int range = max - min +1;
        int rand = (int) (Math.random()* range + min);

        if (rand >=65 && rand <= 90 || rand >= 97&& rand <=122)
        {
            System.out.printf("rand = %c", rand);
        }
         else{
            if (rand >90 || rand <97)
            {
                // if 문으로 다시 돌아가라고 코딩하고싶은데... 잘 안돼네요.
            }

        }

        }

    }

