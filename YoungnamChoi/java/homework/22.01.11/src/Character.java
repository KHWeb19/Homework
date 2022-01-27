public class Character {
    private CharacterLevel level;

    public Character(){
        level= new CharacterLevel();
        level.showLevelMessage();
    }

   public void upgradeLevel( CharacterLevel level ) {
       this.level = level;
       level.showLevelMessage();
   }

   public void play(int count){
        level.go(count);
   }
}
