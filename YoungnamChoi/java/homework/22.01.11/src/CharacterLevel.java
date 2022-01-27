public  class CharacterLevel {
    public void qSkil() {

    };

    public void wSkil() {

    };

    public void showLevelMessage() {
    };


    final public void go(int count) {
        qSkil();
        for (int i = 0; i < count; i++) {
            wSkil();
        }

    }

}
