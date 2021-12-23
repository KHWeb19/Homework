public class Fourth {
    public static void main(String[] args) {
        int i=(int)(Math.random()*(97-4)+4);

        System.out.println(i);

        int j=(int)(Math.random()*(90-65)+65);
        int k=(int)(Math.random()*(122-97)+97);
        int l=(int)(Math.random()*(122-65)+65);

        System.out.println(j);
        System.out.println(k);

        if(l>=65 && l<=90){
            System.out.println("65~90 "+l);
        }else if(l>=97 && l<=122){
            System.out.println("97~122 "+l);
        }else{
            System.out.println("그 외 "+l);
        }

    }
}
