public class GameMaster extends Player {
        Level pl = new Level();
    public void fight(){
        do {
            level += 1;
            pl.levelUp();
        }
        while(level <= 99);
    }
}
