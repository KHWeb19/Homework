public class Player {
    String id;
    Job playerJob = new Job();
    Level playerLevel = new Level();
    int level;
    String job;

    public Player(String id) {
        this.id = id;
        this.level = playerLevel.level;
        playerJob.initJob();
        this.job = playerJob.job;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", level=" + level +
                ", job='" + job + '\'' +
                '}';
    }
}
