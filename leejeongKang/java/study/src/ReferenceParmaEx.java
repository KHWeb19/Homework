class ReferenceParmaEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main :" + d.x);

        change(d);
        System.out.println("after change(d)"+ d.x);

    }

    static void change (Data d){
            d.x = 10000;
            System.out.println("change :" +d.x);

    }
}
