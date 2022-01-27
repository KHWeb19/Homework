class PrimitiveparamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("d.x"+ d.x);

        change (d.x);
            System.out.println("After change d.x");
            System.out.println(d.x);
    }
    static void change (int x){
        x=10000;
        System.out.println("change :" +x);
    }
}
