public abstract class PercussiveInstruments {
    private String model;
    private String sound;

    protected PercussiveInstruments(String model, String sound){
        this.model = model;
        this.sound = sound;
    }

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

    public abstract void play();
}

interface Adjustable {
    void adjust();
}