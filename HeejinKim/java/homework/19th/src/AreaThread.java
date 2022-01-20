public class AreaThread implements Runnable {

    Area area;

    public AreaThread() {

        area=new Area(2,2,0.001);

    }

    @Override
    public void run() {

        for (int i = 0; i < area.getDivide(); i++) {

            area.sumArea();
        }

    }
}

