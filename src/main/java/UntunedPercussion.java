class UntunedPercussion extends PercussiveInstruments {
    private int dynamics;

    public UntunedPercussion(String model, String sound, int dynamics) {
        super(model, sound);
        this.dynamics = dynamics;
    }

    public int getDynamics() {
        return dynamics;
    }

    public void setDynamics(int dynamics) {
        this.dynamics = dynamics;
    }

    public void play() {
        System.out.println(getModel() + " plays with sound " + getSound() + " at dynamics level " + dynamics);
    }

    public void crescendo() {
        System.out.println(getModel() + " is crescendoing.");
    }

    public void decrescendo() {
        System.out.println(getModel() + " is decrescendoing.");
    }
}
