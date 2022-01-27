public class Problem01 {
    public static void main(String[] args) {
        int min = 65;
        int max = 122;

        int rand = (int)(Math.random()*(max - min +1) + min);

        if(rand>90 && rand<97){
            rand = (int)(Math.random()*(max - min +1) + min);
        }
        System.out.printf("%c\n", rand);
    }
    }


