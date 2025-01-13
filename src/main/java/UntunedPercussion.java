public class UntunedPercussion extends PercussiveInstruments {
    private int dynamics;

    // constructor
    public UntunedPercussion(String model, String sound, int dynamics) {
        super(model, sound);
        this.dynamics = dynamics;
    }

    // setter and getter for dynamics
    public int getDynamics() {
        return dynamics;
    }

    public void setDynamics(int dynamics) {
        this.dynamics = dynamics;
    }

    // method to play instrument
    public void play() {
        System.out.println(getModel() + " plays with sound " + getSound() + " at dynamics level " + dynamics);
    }

    // method to play louder
    public void crescendo() {
        System.out.println(getModel() + " is crescendoing.");
    }

    // method to play softer
    public void decrescendo() {
        System.out.println(getModel() + " is decrescendoing.");
    }
}
