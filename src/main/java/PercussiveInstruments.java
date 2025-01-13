public abstract class PercussiveInstruments {
    private String model;
    private String sound;

    // constructor
    protected PercussiveInstruments(String model, String sound){
        this.model = model;
        this.sound = sound;
    }

    // getters and setters for instrument model and sound
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // abstract play instrument method to be implemented by child and grandchild classes
    public abstract void play();
}

// adjusts instrument's settings
interface Adjustable {
    void adjust();
}