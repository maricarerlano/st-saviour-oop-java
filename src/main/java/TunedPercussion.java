public class TunedPercussion extends PercussiveInstruments implements Adjustable {
    private String pitch;

    // constructor
    public TunedPercussion(String model, String sound, String pitch) {
        super(model, sound);
        this.pitch = pitch;
    }

    // setter and getter for pitch
    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    // Adjustable interface
    public void adjust() {
        System.out.println(getModel() + " is being adjusted for pitch.");
    }

    public void play() {
        System.out.println(getModel() + " plays at pitch " + pitch + " with sound " + getSound());
    }

    public void tune() {
        System.out.println(getModel() + " is being tuned.");
    }
}