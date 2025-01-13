class TunedPercussion extends PercussiveInstruments implements Adjustable {
    private String pitch;

    public TunedPercussion(String model, String sound, String pitch) {
        super(model, sound);
        this.pitch = pitch;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

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